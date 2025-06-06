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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPipelineVertexInputDivisorStateCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t vertexBindingDivisorCount;
 *     {@link VkVertexInputBindingDivisorDescription VkVertexInputBindingDivisorDescription} const * pVertexBindingDivisors;
 * }}</pre>
 */
public class VkPipelineVertexInputDivisorStateCreateInfoKHR extends VkPipelineVertexInputDivisorStateCreateInfo {

    protected VkPipelineVertexInputDivisorStateCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineVertexInputDivisorStateCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescription.Buffer} to the {@code pVertexBindingDivisors} field. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoKHR pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) { npVertexBindingDivisors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoKHR set(
        int sType,
        long pNext,
        VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors
    ) {
        sType(sType);
        pNext(pNext);
        pVertexBindingDivisors(pVertexBindingDivisors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR set(VkPipelineVertexInputDivisorStateCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR malloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR calloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR create(long address) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineVertexInputDivisorStateCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineVertexInputDivisorStateCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineVertexInputDivisorStateCreateInfoKHR} structs. */
    public static class Buffer extends VkPipelineVertexInputDivisorStateCreateInfo.Buffer {

        private static final VkPipelineVertexInputDivisorStateCreateInfoKHR ELEMENT_FACTORY = VkPipelineVertexInputDivisorStateCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkPipelineVertexInputDivisorStateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineVertexInputDivisorStateCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineVertexInputDivisorStateCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescription.Buffer} to the {@code pVertexBindingDivisors} field. */
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) { VkPipelineVertexInputDivisorStateCreateInfoKHR.npVertexBindingDivisors(address(), value); return this; }

    }

}