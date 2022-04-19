package net.trashoflevillage.villagersouls.items;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import com.mojang.logging.LogUtils;
import net.minecraft.advancements.critereon.CuredZombieVillagerTrigger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.client.resources.sounds.SoundEventRegistration;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import javax.sound.midi.Soundbank;
import java.util.List;

public class IllSoulItem extends Item {
    private static final Logger LOGGER = LogUtils.getLogger();

    public IllSoulItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    }

    // @Nullable means that the parameter might be null.

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("item.villagersouls.ill_soul.desc"));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos blockpos = context.getClickedPos();

        if (!level.isClientSide) {
            LOGGER.info("!level.isClientSide");
            if (level.getBlockState(blockpos).getBlock().equals(Blocks.CARVED_PUMPKIN)) {
                LOGGER.info("Carved Pumpkin Clicked");
                level.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 0);
                level.playSound(player, blockpos, SoundEvents.RESPAWN_ANCHOR_DEPLETE, SoundSource.BLOCKS, 1f, 1f);
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

}
