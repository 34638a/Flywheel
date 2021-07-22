package com.jozufozu.flywheel.util.transform;

import com.mojang.blaze3d.vertex.PoseStack;

import com.mojang.math.Quaternion;

public class MatrixTransformStack implements TransformStack {

	private final PoseStack internal = new PoseStack();

	public PoseStack unwrap() {
		return internal;
	}

	@Override
	public TransformStack translate(double x, double y, double z) {
		internal.translate(x, y, z);
		return this;
	}

	@Override
	public TransformStack multiply(Quaternion quaternion) {
		internal.mulPose(quaternion);
		return this;
	}

	@Override
	public TransformStack push() {
		return this;
	}

	@Override
	public TransformStack pop() {
		return this;
	}
}
