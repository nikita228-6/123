package com.example.fireblade;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class FireSwordItem extends SwordItem {

    // Итоговый урон = 1 (кулак) + 4 (бонус незерита) + 15 = 20
    public FireSwordItem() {
        super(Tiers.NETHERITE, 15, -2.4F,
                new Properties().rarity(Rarity.EPIC).fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setSecondsOnFire(8); // поджигаем жертву на 8 секунд
        return super.hurtEnemy(stack, target, attacker);
    }
}
