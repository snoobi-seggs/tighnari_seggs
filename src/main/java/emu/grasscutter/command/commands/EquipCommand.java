package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.ItemData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.inventory.ItemType;
import emu.grasscutter.game.player.Player;

import java.util.List;

@Command(label = "equip" , description = "Equip weapon to active character", 
        usage = "equip <weaponId>", aliases = {"eq","e"}, permission = "player.equip", permissionTargeted = "player.equip.others")
public final class EquipCommand implements CommandHandler {
    @Override public void execute(Player sender, Player targetPlayer, List<String> args) {
        GameItem targetItem;
        int itemId;
        Avatar activeAvatar;
        
        if (args.size() != 1) {
            CommandHandler.sendMessage(sender, "Wrong args size. Usage: equip <weaponId>");
            return;
        }

        itemId = Integer.parseInt(args.get(0));
        ItemData itemData = GameData.getItemDataMap().get(itemId);
        if (itemData == null) {
            CommandHandler.sendMessage(sender, "Invalid weaponId");
            return;
        }

        if (itemData.getItemType() != ItemType.ITEM_WEAPON) {
            CommandHandler.sendMessage(sender, "Invalid weaponId");
            return;
        }

        
        Player player = sender;
        if (player == null) {
            CommandHandler.sendMessage(sender, "Invalid player");
            return;
        }

        if (targetPlayer != null) {
            player = targetPlayer;
        }


        List<GameItem> items =  player.getInventory().getItems().values().stream()
                            .filter(item -> item.getItemId() == itemId)
                            .filter(item -> !item.isEquipped())
                            .toList();

        if (items.size() == 0) {
            targetItem = new GameItem(itemId);
            targetItem.setRefinement(5);
            targetItem.setLevel(90);
            targetItem.setPromoteLevel(6);
        } else {
            targetItem = items.get(0);
        }

        activeAvatar = player.getTeamManager().getCurrentAvatarEntity().getAvatar();
        boolean isSuccess =  activeAvatar.equipItem(targetItem, true);

        if (isSuccess == true) {
            CommandHandler.sendMessage(sender, "Success equiping weapon");
        } else {
            CommandHandler.sendMessage(sender, "Failed to equip weapon");
        }
    }
}
