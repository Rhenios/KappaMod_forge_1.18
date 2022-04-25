package net.Rhenios.kappamod.item;

import net.Rhenios.kappamod.kappamod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, kappamod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> cucumber_fly_ring = registernomalItem("cucumber_fly_ring");
    public static final RegistryObject<Item> cucumberalloy = registernomalItem("cucumberalloy");
    public static final RegistryObject<Item> cucumberalloyingot = registernomalItem("cucumberalloyingot");
    public static final RegistryObject<Item> cucumberingot = registernomalItem("cucumberingot");
    public static final RegistryObject<Item> cucumberraw = registernomalItem(       "cucumberraw");
    public static final RegistryObject<Item> hardcucumberingot = registernomalItem("hardcucumberingot");
    public static final RegistryObject<Item> hardcucumberraw = registernomalItem("hardcucumberraw");
    public static final RegistryObject<Item> cucumbermatter = registernomalItem("cucumbermatter");
    public static final RegistryObject<Item> shardofcucumber = registernomalItem("shardofcucumber");

    public static RegistryObject<Item> registernomalItem(String name){
        return ITEMS.register(name, ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
