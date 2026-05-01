package io.github.misode.invrestore.gui;

import me.lucko.fabric.api.permissions.v0.Permissions;
import net.minecraft.server.permissions.PermissionLevel;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class SnapshotSlot extends Slot {
    public SnapshotSlot(Container container, int slot, int x, int y) {
        super(container, slot, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean mayPickup(Player player) {
        return Permissions.check(player, "invrestore.can_modify", PermissionLevel.GAMEMASTERS);
    }
}
