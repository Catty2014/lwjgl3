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
 * struct VkCopyMemoryToAccelerationStructureInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} src;
 *     VkAccelerationStructureKHR dst;
 *     VkCopyAccelerationStructureModeKHR mode;
 * }}</pre>
 */
public class VkCopyMemoryToAccelerationStructureInfoKHR extends Struct<VkCopyMemoryToAccelerationStructureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRC,
        DST,
        MODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRC = layout.offsetof(2);
        DST = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    protected VkCopyMemoryToAccelerationStructureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToAccelerationStructureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToAccelerationStructureInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code src} field. */
    public VkDeviceOrHostAddressConstKHR src() { return nsrc(address()); }
    /** @return the value of the {@code dst} field. */
    @NativeType("VkAccelerationStructureKHR")
    public long dst() { return ndst(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("VkCopyAccelerationStructureModeKHR")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR} value to the {@code sType} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code src} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR src(VkDeviceOrHostAddressConstKHR value) { nsrc(address(), value); return this; }
    /** Passes the {@code src} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToAccelerationStructureInfoKHR src(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(src()); return this; }
    /** Sets the specified value to the {@code dst} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR dst(@NativeType("VkAccelerationStructureKHR") long value) { ndst(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryToAccelerationStructureInfoKHR set(
        int sType,
        long pNext,
        VkDeviceOrHostAddressConstKHR src,
        long dst,
        int mode
    ) {
        sType(sType);
        pNext(pNext);
        src(src);
        dst(dst);
        mode(mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyMemoryToAccelerationStructureInfoKHR set(VkCopyMemoryToAccelerationStructureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR malloc() {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR calloc() {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToAccelerationStructureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance for the specified memory address. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR create(long address) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryToAccelerationStructureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToAccelerationStructureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyMemoryToAccelerationStructureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMemoryToAccelerationStructureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #src}. */
    public static VkDeviceOrHostAddressConstKHR nsrc(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkCopyMemoryToAccelerationStructureInfoKHR.SRC); }
    /** Unsafe version of {@link #dst}. */
    public static long ndst(long struct) { return memGetLong(struct + VkCopyMemoryToAccelerationStructureInfoKHR.DST); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + VkCopyMemoryToAccelerationStructureInfoKHR.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyMemoryToAccelerationStructureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMemoryToAccelerationStructureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #src(VkDeviceOrHostAddressConstKHR) src}. */
    public static void nsrc(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkCopyMemoryToAccelerationStructureInfoKHR.SRC, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #dst(long) dst}. */
    public static void ndst(long struct, long value) { memPutLong(struct + VkCopyMemoryToAccelerationStructureInfoKHR.DST, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + VkCopyMemoryToAccelerationStructureInfoKHR.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToAccelerationStructureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryToAccelerationStructureInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyMemoryToAccelerationStructureInfoKHR ELEMENT_FACTORY = VkCopyMemoryToAccelerationStructureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToAccelerationStructureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToAccelerationStructureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMemoryToAccelerationStructureInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMemoryToAccelerationStructureInfoKHR.npNext(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code src} field. */
        public VkDeviceOrHostAddressConstKHR src() { return VkCopyMemoryToAccelerationStructureInfoKHR.nsrc(address()); }
        /** @return the value of the {@code dst} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long dst() { return VkCopyMemoryToAccelerationStructureInfoKHR.ndst(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("VkCopyAccelerationStructureModeKHR")
        public int mode() { return VkCopyMemoryToAccelerationStructureInfoKHR.nmode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR} value to the {@code sType} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyMemoryToAccelerationStructureInfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code src} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer src(VkDeviceOrHostAddressConstKHR value) { VkCopyMemoryToAccelerationStructureInfoKHR.nsrc(address(), value); return this; }
        /** Passes the {@code src} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer src(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(src()); return this; }
        /** Sets the specified value to the {@code dst} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer dst(@NativeType("VkAccelerationStructureKHR") long value) { VkCopyMemoryToAccelerationStructureInfoKHR.ndst(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.nmode(address(), value); return this; }

    }

}