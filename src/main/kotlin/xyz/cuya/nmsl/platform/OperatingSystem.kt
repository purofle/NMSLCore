package xyz.cuya.nmsl.platform

/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2021  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */


/**
 * Represents the operating system.
 *
 * @author huangyuhui
 */
enum class OperatingSystem(val checkedName: String) {
    /**
     * Microsoft Windows.
     */
    WINDOWS("windows"),

    /**
     * Linux and Unix like OS, including Solaris.
     */
    LINUX("linux"),

    /**
     * Mac OS X.
     */
    OSX("osx"),

    /**
     * Unknown operating system.
     */
    UNKNOWN("universal");

    companion object {
        /**
         * The current operating system.
         */
        private val CURRENT_OS = parseOSName(System.getProperty("os.name"))

        fun parseOSName(name: String): OperatingSystem {
            val name_lower = name.trim { it <= ' ' }.lowercase()
            return if (name_lower.contains("win")) WINDOWS else if (name_lower.contains("mac")) OSX else if (name_lower.contains(
                    "solaris"
                ) || name_lower.contains(
                    "linux"
                ) || name_lower.contains("unix") || name_lower.contains("sunos")
            ) LINUX else UNKNOWN
        }
    }
}