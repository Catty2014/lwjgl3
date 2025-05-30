/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkStridedDeviceAddressRegionKHR {
 *     VkDeviceAddress deviceAddress;
 *     VkDeviceSize stride;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkStridedDeviceAddressRegionKHR extends Struct<VkStridedDeviceAddressRegionKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEVICEADDRESS,
        STRIDE,
        SIZE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEVICEADDRESS = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkStridedDeviceAddressRegionKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkStridedDeviceAddressRegionKHR create(long address, @Nullable ByteBuffer container) {
        return new VkStridedDeviceAddressRegionKHR(address, container);
    }

    /**
     * Creates a {@code VkStridedDeviceAddressRegionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkStridedDeviceAddressRegionKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code deviceAddress} field. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("VkDeviceSize")
    public long stride() { return nstride(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code deviceAddress} field. */
    public VkStridedDeviceAddressRegionKHR deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkStridedDeviceAddressRegionKHR stride(@NativeType("VkDeviceSize") long value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkStridedDeviceAddressRegionKHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkStridedDeviceAddressRegionKHR set(
        long deviceAddress,
        long stride,
        long size
    ) {
        deviceAddress(deviceAddress);
        stride(stride);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkStridedDeviceAddressRegionKHR set(VkStridedDeviceAddressRegionKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkStridedDeviceAddressRegionKHR malloc() {
        return new VkStridedDeviceAddressRegionKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkStridedDeviceAddressRegionKHR calloc() {
        return new VkStridedDeviceAddressRegionKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated with {@link BufferUtils}. */
    public static VkStridedDeviceAddressRegionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkStridedDeviceAddressRegionKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkStridedDeviceAddressRegionKHR} instance for the specified memory address. */
    public static VkStridedDeviceAddressRegionKHR create(long address) {
        return new VkStridedDeviceAddressRegionKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkStridedDeviceAddressRegionKHR createSafe(long address) {
        return address == NULL ? null : new VkStridedDeviceAddressRegionKHR(address, null);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkStridedDeviceAddressRegionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkStridedDeviceAddressRegionKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStridedDeviceAddressRegionKHR malloc(MemoryStack stack) {
        return new VkStridedDeviceAddressRegionKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStridedDeviceAddressRegionKHR calloc(MemoryStack stack) {
        return new VkStridedDeviceAddressRegionKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return memGetLong(struct + VkStridedDeviceAddressRegionKHR.DEVICEADDRESS); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return memGetLong(struct + VkStridedDeviceAddressRegionKHR.STRIDE); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkStridedDeviceAddressRegionKHR.SIZE); }

    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { memPutLong(struct + VkStridedDeviceAddressRegionKHR.DEVICEADDRESS, value); }
    /** Unsafe version of {@link #stride(long) stride}. */
    public static void nstride(long struct, long value) { memPutLong(struct + VkStridedDeviceAddressRegionKHR.STRIDE, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkStridedDeviceAddressRegionKHR.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkStridedDeviceAddressRegionKHR} structs. */
    public static class Buffer extends StructBuffer<VkStridedDeviceAddressRegionKHR, Buffer> implements NativeResource {

        private static final VkStridedDeviceAddressRegionKHR ELEMENT_FACTORY = VkStridedDeviceAddressRegionKHR.create(-1L);

        /**
         * Creates a new {@code VkStridedDeviceAddressRegionKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkStridedDeviceAddressRegionKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkStridedDeviceAddressRegionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkStridedDeviceAddressRegionKHR.ndeviceAddress(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("VkDeviceSize")
        public long stride() { return VkStridedDeviceAddressRegionKHR.nstride(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkStridedDeviceAddressRegionKHR.nsize(address()); }

        /** Sets the specified value to the {@code deviceAddress} field. */
        public VkStridedDeviceAddressRegionKHR.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkStridedDeviceAddressRegionKHR.ndeviceAddress(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkStridedDeviceAddressRegionKHR.Buffer stride(@NativeType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.nstride(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkStridedDeviceAddressRegionKHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.nsize(address(), value); return this; }

    }

}