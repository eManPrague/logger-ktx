import groovy.lang.MissingPropertyException
import org.gradle.api.Project
import org.gradle.kotlin.dsl.extra
import java.io.File
import java.util.Properties

inline fun <reified T> Project.getPropertyOrNull(name: String): T? = findProperty(name) as T?

@Throws(MissingPropertyException::class)
inline fun <reified T> Project.getProperty(name: String): T = property(name) as T

/**
 * @param file Properties filename
 */
fun Project.applyProperties(file: String) = applyProperties(file(file))

/**
 * @param file Properties file
 */
fun Project.applyProperties(file: File) {
    file.readPropertiesFile()?.forEach { (name, value) -> extra.set(name as String, value) }
}

private fun File.readPropertiesFile(): Properties? = takeIf { it.exists() && it.isFile }?.let {
    Properties().apply { it.reader().use(::load) }
}
