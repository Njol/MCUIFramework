package ch.njol.minecraft.uiframework.mixins;

import com.mojang.serialization.MapCodec;
import net.minecraft.client.texture.atlas.AtlasSource;
import net.minecraft.client.texture.atlas.AtlasSourceManager;
import net.minecraft.client.texture.atlas.AtlasSourceType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(AtlasSourceManager.class)
public interface AtlasSourceManagerAccessor {
	@Invoker("register")
	static AtlasSourceType doRegister(String id, MapCodec<? extends AtlasSource> codec) {
		return null;
	}
}
