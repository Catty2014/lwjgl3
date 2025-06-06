/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CLNativeKernel extends Callback implements CLNativeKernelI {

    /**
     * Creates a {@code CLNativeKernel} instance from the specified function pointer.
     *
     * @return the new {@code CLNativeKernel}
     */
    public static CLNativeKernel create(long functionPointer) {
        CLNativeKernelI instance = Callback.get(functionPointer);
        return instance instanceof CLNativeKernel
            ? (CLNativeKernel)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLNativeKernel createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CLNativeKernel} instance that delegates to the specified {@code CLNativeKernelI} instance. */
    public static CLNativeKernel create(CLNativeKernelI instance) {
        return instance instanceof CLNativeKernel
            ? (CLNativeKernel)instance
            : new Container(instance.address(), instance);
    }

    protected CLNativeKernel() {
        super(CIF);
    }

    CLNativeKernel(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLNativeKernel {

        private final CLNativeKernelI delegate;

        Container(long functionPointer, CLNativeKernelI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long args) {
            delegate.invoke(args);
        }

    }

}