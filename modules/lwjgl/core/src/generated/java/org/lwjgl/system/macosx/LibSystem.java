/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

public final class LibSystem {

    private static final SharedLibrary SYSTEM = Library.loadNative(LibSystem.class, "org.lwjgl", "System");

    /** Returns the System {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SYSTEM;
    }

    private LibSystem() {
        throw new UnsupportedOperationException();
    }

}