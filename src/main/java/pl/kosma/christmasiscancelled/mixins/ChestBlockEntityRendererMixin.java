package pl.kosma.christmasiscancelled.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;

@Mixin(ChestBlockEntityRenderer.class)
public class ChestBlockEntityRendererMixin
{
	@Shadow
	private boolean christmas;

	@Inject(method="<init>", at=@At("TAIL"))
	public void ChestBlockEntityRenderer(BlockEntityRenderDispatcher blockEntityRenderDispatcher, CallbackInfo ci) {
		this.christmas = false;
	}
}
