package Factories;

import Entities.Enemy;
import Items.Armor;
import Items.Item;
import Items.MainHand;
import Items.Skills.DamageAbility;
import Items.Skills.RecoverManaAbility;
import Items.Skills.Skill;

public class EnemyFactory {

    public Enemy createEnemy(){

        //Todo: add item variety for enemies
        Enemy enemy = new Enemy("enemy");
        Skill knifeSkill = new Skill("stab");
        DamageAbility damageAbility = new DamageAbility("10 base damage", 10, 20, 0);
        knifeSkill.addAbility(damageAbility);
        Item knife = new MainHand("knife", knifeSkill);
        enemy.equipItem(knife);

        return enemy;
    }
}
