package com.example.basicapplanga

import android.app.Application
import android.content.res.Resources
import com.example.basicapplanga.ui.main.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class Test {

    companion object {
        const val FAKE_STRING = "FAKE_STRING"
    }

    @Mock
    private lateinit var mockContext: Application
    @Mock
    private lateinit var mockResources: Resources

    @Test
    fun readStringFromContext_LocalizedString() {
        Mockito.`when`(mockResources.getString(R.string.app_name)).thenReturn(FAKE_STRING)

        Mockito.`when`(mockContext.resources).thenReturn(mockResources)

        val myObjectUnderTest = MainViewModel(mockContext)

        // ...when the string is returned from the object under test...
        val result: String = myObjectUnderTest.getAppName()

        // ...then the result should be the expected one.
        assertEquals(result, FAKE_STRING)
    }
}