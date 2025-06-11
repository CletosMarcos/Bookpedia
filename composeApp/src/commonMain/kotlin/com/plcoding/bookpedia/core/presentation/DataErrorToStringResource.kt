package com.plcoding.bookpedia.core.presentation

import androidx.compose.material3.Text
import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.error_diskfull
import cmp_bookpedia.composeapp.generated.resources.error_nointernet
import cmp_bookpedia.composeapp.generated.resources.error_serializatioin
import cmp_bookpedia.composeapp.generated.resources.error_timeout
import cmp_bookpedia.composeapp.generated.resources.error_toomanyrequests
import cmp_bookpedia.composeapp.generated.resources.error_unknown
import com.plcoding.bookpedia.core.domain.DataError

fun DataError.toUiText(): UiText {
    val stringRes =  when(this) {
        DataError.Local.DISK_FULL -> Res.string.error_diskfull
        DataError.Local.UNKNOWN -> Res.string.error_unknown
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.error_timeout
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.error_toomanyrequests
        DataError.Remote.NO_INTERNET -> Res.string.error_nointernet
        DataError.Remote.SERVER -> Res.string.error_unknown
        DataError.Remote.SERIALIZATION -> Res.string.error_serializatioin
        DataError.Remote.UNKNOWN -> Res.string.error_unknown
    }
    return UiText.StringResourceId(stringRes)
}