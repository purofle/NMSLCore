/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/master/LICENSE
 */

package xyz.cuya.nmsl.setting

object DownloadProviders {
    val bmclapiRoot: String = System.getProperty("hmcl.bmclapi.override") ?: "https://bmclapi2.bangbang93.com"
}