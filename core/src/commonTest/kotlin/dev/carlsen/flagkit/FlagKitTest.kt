package dev.carlsen.flagkit

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class FlagKitTest {

    companion object {
        val validCodes = listOf(
            "AR",
            "DK",
            "GB",
            "US",
            "US-CA"
        )

        val invalidCodes = listOf(
            "AA",
            "CE",
            "ZZ"
        )
    }
    @Test
    fun shouldFindMatchingFlag() {
        for (code in validCodes) {
            assertNotNull(FlagKit.getFlag(code))
        }
    }

    @Test
    fun shouldNotFindMatchingFlag() {
        for (code in invalidCodes) {
            assertNull(FlagKit.getFlag(code))
        }
    }
}