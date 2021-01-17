package com.UASPCS18120635.PCSUAS18120635.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class User (
    var login: String = "",
    var avatarUrl: String = "",
    var htmlUrl: String = "",
    var followersUrl: String = "",
    var followers: Int = 0,
    var followingsUrl: String = "",
    var following: Int = 0,
    var repoUrl: String = "",
    var repos: Int = 0
) : Parcelable