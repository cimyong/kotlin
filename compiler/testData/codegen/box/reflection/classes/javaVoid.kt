// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS, NATIVE
// WITH_REFLECT

import kotlin.reflect.KClass
import kotlin.test.assertEquals

fun box(): String {
    assertEquals(Void::class, Void.TYPE.kotlin)
    assertEquals(Void.TYPE.kotlin, Void::class)

    assertEquals(Void.TYPE, Void::class.javaPrimitiveType)
    assertEquals(Void::class.java, Void::class.javaObjectType)
    assertEquals(Void.TYPE, Void.TYPE.kotlin.javaPrimitiveType)
    assertEquals(Void::class.java, Void.TYPE.kotlin.javaObjectType)

    return "OK"
}
