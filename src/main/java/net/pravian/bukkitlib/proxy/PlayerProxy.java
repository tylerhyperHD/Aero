package net.pravian.bukkitlib.proxy;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Sound;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.block.Block;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;

/**
 * Represents a proxy for a player.
 */
@SuppressWarnings("deprecation")
public class PlayerProxy extends EntityProxy<Player> implements Player {

    /**
     * Creates a new PlayerProxy instance.
     *
     * @param base The proxy base.
     */
    public PlayerProxy(Player base) {
        super(base);
    }

    @Override
    public String getDisplayName() {
        return base.getDisplayName();
    }

    @Override
    public void setDisplayName(String string) {
        base.setDisplayName(string);
    }

    @Override
    public String getPlayerListName() {
        return base.getPlayerListName();
    }

    @Override
    public void setPlayerListName(String string) {
        base.setPlayerListName(string);
    }

    @Override
    public void setCompassTarget(Location lctn) {
        base.setCompassTarget(lctn);
    }

    @Override
    public Location getCompassTarget() {
        return base.getCompassTarget();
    }

    @Override
    public InetSocketAddress getAddress() {
        return base.getAddress();
    }

    @Override
    public void sendRawMessage(String string) {
        base.sendRawMessage(string);
    }

    @Override
    public void kickPlayer(String string) {
        base.sendRawMessage(string);
    }

    @Override
    public void chat(String string) {
        base.sendRawMessage(string);
    }

    @Override
    public boolean performCommand(String string) {
        return base.performCommand(string);
    }

    @Override
    public boolean isSneaking() {
        return base.isSneaking();
    }

    @Override
    public void setSneaking(boolean bln) {
        base.setSneaking(bln);
    }

    @Override
    public boolean isSprinting() {
        return base.isSprinting();
    }

    @Override
    public void setSprinting(boolean bln) {
        base.setSprinting(bln);
    }

    @Override
    public void saveData() {
        base.saveData();
    }

    @Override
    public void loadData() {
        base.loadData();
    }

    @Override
    public void setSleepingIgnored(boolean bln) {
        base.setSleepingIgnored(bln);
    }

    @Override
    public boolean isSleepingIgnored() {
        return base.isSleepingIgnored();
    }

    @Override
    public void playNote(Location lctn, byte b, byte b1) {
        base.playNote(lctn, b, b1);
    }

    @Override
    public void playNote(Location lctn, Instrument i, Note note) {
        base.playNote(lctn, i, note);
    }

    @Override
    public void playSound(Location lctn, Sound sound, float f, float f1) {
        base.playSound(lctn, sound, f, f1);
    }

    @Override
    public void playSound(Location lctn, String string, float f, float f1) {
        base.playSound(lctn, string, f, f1);
    }

    @Override
    public void playEffect(Location lctn, Effect effect, int i) {
        base.playEffect(lctn, effect, i);
    }

    @Override
    public <T> void playEffect(Location lctn, Effect effect, T t) {
        base.playEffect(lctn, effect, t);
    }

    @Override
    public void sendBlockChange(Location lctn, Material mtrl, byte b) {
        base.sendBlockChange(lctn, mtrl, b);
    }

    @Override
    public boolean sendChunkChange(Location lctn, int i, int i1, int i2, byte[] bytes) {
        return base.sendChunkChange(lctn, i, i1, i2, bytes);
    }

    @Override
    public void sendBlockChange(Location lctn, int i, byte b) {
        base.sendBlockChange(lctn, i, b);
    }

    @Override
    public void sendMap(MapView mv) {
        base.sendMap(mv);
    }

    @Override
    public void updateInventory() {
        base.updateInventory();
    }

    @Override
    public void awardAchievement(Achievement a) {
        base.awardAchievement(a);
    }

    @Override
    public void incrementStatistic(Statistic ststc) {
        base.incrementStatistic(ststc);
    }

    @Override
    public void incrementStatistic(Statistic ststc, int i) {
        base.incrementStatistic(ststc, i);
    }

    @Override
    public void incrementStatistic(Statistic ststc, Material mtrl) {
        base.incrementStatistic(ststc, mtrl);
    }

    @Override
    public void incrementStatistic(Statistic ststc, Material mtrl, int i) {
        base.incrementStatistic(ststc, mtrl, i);
    }

    @Override
    public void setPlayerTime(long l, boolean bln) {
        base.setPlayerTime(l, bln);
    }

    @Override
    public long getPlayerTime() {
        return base.getPlayerTime();
    }

    @Override
    public long getPlayerTimeOffset() {
        return base.getPlayerTimeOffset();
    }

    @Override
    public boolean isPlayerTimeRelative() {
        return base.isPlayerTimeRelative();
    }

    @Override
    public void resetPlayerTime() {
        base.resetPlayerTime();
    }

    @Override
    public void setPlayerWeather(WeatherType wt) {
        base.setPlayerWeather(wt);
    }

    @Override
    public WeatherType getPlayerWeather() {
        return base.getPlayerWeather();
    }

    @Override
    public void resetPlayerWeather() {
        base.resetPlayerWeather();
    }

    @Override
    public void giveExp(int i) {
        base.giveExp(i);
    }

    @Override
    public void giveExpLevels(int i) {
        base.giveExpLevels(i);
    }

    @Override
    public float getExp() {
        return base.getExp();
    }

    @Override
    public void setExp(float f) {
        base.setExp(f);
    }

    @Override
    public int getLevel() {
        return base.getLevel();
    }

    @Override
    public void setLevel(int i) {
        base.setLevel(i);
    }

    @Override
    public int getTotalExperience() {
        return base.getTotalExperience();
    }

    @Override
    public void setTotalExperience(int i) {
        base.setTotalExperience(i);
    }

    @Override
    public float getExhaustion() {
        return base.getExhaustion();
    }

    @Override
    public void setExhaustion(float f) {
        base.setExhaustion(f);
    }

    @Override
    public float getSaturation() {
        return base.getSaturation();
    }

    @Override
    public void setSaturation(float f) {
        base.setSaturation(f);
    }

    @Override
    public int getFoodLevel() {
        return base.getFoodLevel();
    }

    @Override
    public void setFoodLevel(int i) {
        base.setFoodLevel(i);
    }

    @Override
    public Location getBedSpawnLocation() {
        return base.getBedSpawnLocation();
    }

    @Override
    public void setBedSpawnLocation(Location lctn) {
        base.setBedSpawnLocation(lctn);
    }

    @Override
    public void setBedSpawnLocation(Location lctn, boolean bln) {
        base.setBedSpawnLocation(lctn, bln);
    }

    @Override
    public boolean getAllowFlight() {
        return base.getAllowFlight();
    }

    @Override
    public void setAllowFlight(boolean bln) {
        base.setAllowFlight(bln);
    }

    @Override
    public void hidePlayer(Player player) {
        base.hidePlayer(player);
    }

    @Override
    public void showPlayer(Player player) {
        base.showPlayer(player);
    }

    @Override
    public boolean canSee(Player player) {
        return base.canSee(player);
    }

    @Override
    public boolean isFlying() {
        return base.isFlying();
    }

    @Override
    public void setFlying(boolean bln) {
        base.setFlying(bln);
    }

    @Override
    public void setFlySpeed(float f) throws IllegalArgumentException {
        base.setFlySpeed(f);
    }

    @Override
    public void setWalkSpeed(float f) throws IllegalArgumentException {
        base.setWalkSpeed(f);
    }

    @Override
    public float getFlySpeed() {
        return base.getFlySpeed();
    }

    @Override
    public float getWalkSpeed() {
        return base.getWalkSpeed();
    }

    @Override
    public void setTexturePack(String string) {
        base.setTexturePack(string);
    }

    @Override
    public void setResourcePack(String string) {
        base.setResourcePack(string);
    }

    @Override
    public Scoreboard getScoreboard() {
        return base.getScoreboard();
    }

    @Override
    public void setScoreboard(Scoreboard scrbrd) throws IllegalArgumentException, IllegalStateException {
        base.setScoreboard(scrbrd);
    }

    @Override
    public boolean isHealthScaled() {
        return base.isHealthScaled();
    }

    @Override
    public void setHealthScaled(boolean bln) {
        base.setHealthScaled(bln);
    }

    @Override
    public void setHealthScale(double d) throws IllegalArgumentException {
        base.setHealthScale(d);
    }

    @Override
    public double getHealthScale() {
        return base.getHealthScale();
    }

    @Override
    public String getName() {
        return base.getName();
    }

    @Override
    public PlayerInventory getInventory() {
        return base.getInventory();
    }

    @Override
    public Inventory getEnderChest() {
        return base.getEnderChest();
    }

    @Override
    public boolean setWindowProperty(InventoryView.Property prprt, int i) {
        return base.setWindowProperty(prprt, i);
    }

    @Override
    public InventoryView getOpenInventory() {
        return base.getOpenInventory();
    }

    @Override
    public InventoryView openInventory(Inventory invntr) {
        return base.openInventory(invntr);
    }

    @Override
    public InventoryView openWorkbench(Location lctn, boolean bln) {
        return base.openWorkbench(lctn, bln);
    }

    @Override
    public InventoryView openEnchanting(Location lctn, boolean bln) {
        return base.openEnchanting(lctn, bln);
    }

    @Override
    public void openInventory(InventoryView iv) {
        base.openInventory(iv);
    }

    @Override
    public void closeInventory() {
        base.closeInventory();
    }

    @Override
    public ItemStack getItemInHand() {
        return base.getItemInHand();
    }

    @Override
    public void setItemInHand(ItemStack is) {
        base.setItemInHand(is);
    }

    @Override
    public ItemStack getItemOnCursor() {
        return base.getItemOnCursor();
    }

    @Override
    public void setItemOnCursor(ItemStack is) {
        base.setItemOnCursor(is);
    }

    @Override
    public boolean isSleeping() {
        return base.isSleeping();
    }

    @Override
    public int getSleepTicks() {
        return base.getSleepTicks();
    }

    @Override
    public GameMode getGameMode() {
        return base.getGameMode();
    }

    @Override
    public void setGameMode(GameMode gm) {
        base.setGameMode(gm);
    }

    @Override
    public boolean isBlocking() {
        return base.isBlocking();
    }

    @Override
    public int getExpToLevel() {
        return base.getExpToLevel();
    }

    @Override
    public double getEyeHeight() {
        return base.getEyeHeight();
    }

    @Override
    public double getEyeHeight(boolean bln) {
        return base.getEyeHeight(bln);
    }

    @Override
    public Location getEyeLocation() {
        return base.getEyeLocation();
    }

    @Override
    public List<Block> getLineOfSight(HashSet<Byte> hs, int i) {
        return base.getLineOfSight(hs, i);
    }

    @Override
    public Block getTargetBlock(HashSet<Byte> hs, int i) {
        return base.getTargetBlock(hs, i);
    }

    @Override
    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> hs, int i) {
        return base.getLastTwoTargetBlocks(hs, i);
    }

    @Override
    public Egg throwEgg() {
        return base.throwEgg();
    }

    @Override
    public Snowball throwSnowball() {
        return base.throwSnowball();
    }

    @Override
    public Arrow shootArrow() {
        return base.shootArrow();
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> type) {
        return base.launchProjectile(type);
    }

    @Override
    public int getRemainingAir() {
        return base.getRemainingAir();
    }

    @Override
    public void setRemainingAir(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaximumAir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaximumAir(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaximumNoDamageTicks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaximumNoDamageTicks(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getLastDamage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int _INVALID_getLastDamage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLastDamage(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void _INVALID_setLastDamage(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNoDamageTicks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNoDamageTicks(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Player getKiller() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addPotionEffect(PotionEffect pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addPotionEffect(PotionEffect pe, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addPotionEffects(Collection<PotionEffect> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasPotionEffect(PotionEffectType pet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePotionEffect(PotionEffectType pet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<PotionEffect> getActivePotionEffects() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasLineOfSight(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getRemoveWhenFarAway() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRemoveWhenFarAway(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntityEquipment getEquipment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCanPickupItems(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getCanPickupItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCustomName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCustomName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCustomNameVisible(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCustomNameVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isLeashed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entity getLeashHolder() throws IllegalStateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setLeashHolder(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void damage(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void _INVALID_damage(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void damage(double d, Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void _INVALID_damage(int i, Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int _INVALID_getHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHealth(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void _INVALID_setHealth(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getMaxHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int _INVALID_getMaxHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaxHealth(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void _INVALID_setMaxHealth(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetMaxHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isPermissionSet(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isPermissionSet(Permission prmsn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasPermission(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasPermission(Permission prmsn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String string, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String string, boolean bln, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAttachment(PermissionAttachment pa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recalculatePermissions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isOp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOp(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isConversing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void acceptConversationInput(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean beginConversation(Conversation c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abandonConversation(Conversation c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abandonConversation(Conversation c, ConversationAbandonedEvent cae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendMessage(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendMessage(String[] strings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isOnline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isBanned() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBanned(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isWhitelisted() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWhitelisted(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Player getPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getFirstPlayed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getLastPlayed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasPlayedBefore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Object> serialize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendPluginMessage(Plugin plugin, String string, byte[] bytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}