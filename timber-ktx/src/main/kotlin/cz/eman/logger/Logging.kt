/*
 * MIT License

 * Copyright (c) 2019 eMan s.r.o.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package cz.eman.logger

import timber.log.Timber

/**
 * Send a log message and error with the [Log.DEBUG] severity and tag as a simple name of the [T].
 * @param[message] message text to log (it could be any object)
 * @param[error] an exception to log
 */
fun <T : Any> T.logDebug(message: Any?, error: Throwable? = null) {
    Timber.tag(this::class.java.simpleName)
    Timber.d(error, message?.toString() ?: "null")
}

/**
 * Send a log message and error with the [Log.DEBUG] severity and tag as a simple name of the [T].
 * @param[message] the function that returns message text to log (it could be any object)
 */
inline fun <T : Any> T.logDebug(message: () -> Any?) {
    Timber.tag(this::class.java.simpleName)
    Timber.d(message()?.toString() ?: "null")
}

/*
inline fun <T : Any> T.logDebug(error: Throwable? = null, vararg args: Any, noinline message: () -> Any?) = {
    Timber.tag(this::class.java.simpleName)
    Timber.d(error, message()?.toString() ?: "null", args)
}
*/

/**
 * Send a log message and error with the [Log.WARN] severity and tag as a simple name of the [T].
 * @param[message] message text to log (it could be any object)
 * @param[error] an exception to log
 */
fun <T : Any> T.logWarn(message: Any?, error: Throwable? = null) {
    Timber.tag(this::class.java.simpleName)
    Timber.w(error, message?.toString() ?: "null")
}

/**
 * Send a log message and error with the [Log.WARN] severity and tag as a simple name of the [T].
 * @param[message] the function that returns message text to log (it could be any object)
 */
inline fun <T : Any> T.logWarn(message: () -> Any?) {
    Timber.tag(this::class.java.simpleName)
    Timber.w(message()?.toString() ?: "null")
}

/**
 * Send a log message and error with the [Log.ERROR] severity and tag as a simple name of the [T].
 * @param[message] the function that returns message text to log (it could be any object)
 */
fun <T : Any> T.logError(message: Any?, error: Throwable? = null) {
    Timber.tag(this::class.java.simpleName)
    Timber.e(error, message?.toString() ?: "null")
}

/**
 * Send a log message and error with the [Log.ERROR] severity and tag as a simple name of the [T].
 * @param[message] the function that returns message text to log (it could be any object)
 */
inline fun <T : Any> T.logError(message: () -> Any?) {
    Timber.tag(this::class.java.simpleName)
    Timber.e(message()?.toString() ?: "null")
}

/**
 * Send a log message and error with the [Log.INFO] severity and tag as a simple name of the [T].
 * @param[message] the function that returns message text to log (it could be any object)
 */
fun <T : Any> T.logInfo(message: Any?, error: Throwable? = null) {
    Timber.tag(this::class.java.simpleName)
    Timber.i(error, message?.toString() ?: "null")
}

/**
 * Send a log message and error with the [Log.INFO] severity and tag as a simple name of the [T].
 * @param[message] the function that returns message text to log (it could be any object)
 */
inline fun <T : Any> T.logInfo(message: () -> Any?) {
    Timber.tag(this::class.java.simpleName)
    Timber.i(message()?.toString() ?: "null")
}

/**
 * Send a log message and error with the [Log.VERBOSE] severity and tag as a simple name of the [T].
 * @param[message] the function that returns message text to log (it could be any object)
 */
fun <T : Any> T.logVerbose(message: Any?, error: Throwable? = null) {
    Timber.tag(this::class.java.simpleName)
    Timber.v(error, message?.toString() ?: "null")
}

/**
 * Send a log message and error with the [Log.VERBOSE] severity and tag as a simple name of the [T].
 * @param[message] the function that returns message text to log (it could be any object)
 */
inline fun <T : Any> T.logVerbose(message: () -> Any?) {
    Timber.tag(this::class.java.simpleName)
    Timber.v(message()?.toString() ?: "null")
}



