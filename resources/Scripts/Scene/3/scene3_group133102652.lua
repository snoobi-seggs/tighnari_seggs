local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1
L0_1 = {}
L0_1.group_id = 133102652
L1_1 = {}
L2_1 = {}
L2_1.config_id = 652001
L2_1.monster_id = 25020201
L3_1 = {}
L3_1.x = 1913.314
L3_1.y = 215.75
L3_1.z = 876.068
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 281.133
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 18
L2_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L2_1.disableWander = true
L2_1.pose_id = 9003
L2_1.area_id = 5
L3_1 = {}
L3_1.config_id = 652004
L3_1.monster_id = 25020201
L4_1 = {}
L4_1.x = 1914.69
L4_1.y = 216.338
L4_1.z = 880.808
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 106.424
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 18
L3_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L3_1.disableWander = true
L3_1.pose_id = 9006
L3_1.area_id = 5
L4_1 = {}
L4_1.config_id = 652006
L4_1.monster_id = 25020201
L5_1 = {}
L5_1.x = 1917.685
L5_1.y = 216.582
L5_1.z = 883.613
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 219.97
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 18
L4_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L4_1.disableWander = true
L4_1.pose_id = 9006
L4_1.area_id = 5
L5_1 = {}
L5_1.config_id = 652008
L5_1.monster_id = 25030201
L6_1 = {}
L6_1.x = 1917.72
L6_1.y = 216.598
L6_1.z = 877.252
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 0.0
L6_1.y = 0.0
L6_1.z = 0.0
L5_1.rot = L6_1
L5_1.level = 18
L5_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L5_1.pose_id = 9009
L5_1.area_id = 5
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
monsters = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 652007
L2_1.npc_id = 20076
L3_1 = {}
L3_1.x = 1896.338
L3_1.y = 206.823
L3_1.z = 853.44
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 66.378
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.area_id = 5
L1_1[1] = L2_1
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 652002
L2_1.gadget_id = 70211012
L3_1 = {}
L3_1.x = 1928.74
L3_1.y = 217.421
L3_1.z = 882.203
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 8.971
L3_1.y = 271.53
L3_1.z = 356.704
L2_1.rot = L3_1
L2_1.level = 16
L2_1.drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\231\146\131\230\156\136"
L3_1 = GadgetState
L3_1 = L3_1.ChestLocked
L2_1.state = L3_1
L2_1.isOneoff = true
L2_1.persistent = true
L3_1 = {}
L3_1.name = "chest"
L3_1.exp = 1
L2_1.explore = L3_1
L2_1.area_id = 5
L3_1 = {}
L3_1.config_id = 652005
L3_1.gadget_id = 70360040
L4_1 = {}
L4_1.x = 1896.345
L4_1.y = 206.823
L4_1.z = 853.44
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 0.0
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 18
L3_1.area_id = 5
L1_1[1] = L2_1
L1_1[2] = L3_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1652003
L2_1.name = "ANY_MONSTER_DIE_652003"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_MONSTER_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_MONSTER_DIE_652003"
L2_1.action = "action_EVENT_ANY_MONSTER_DIE_652003"
L1_1[1] = L2_1
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L1_1.suite = 1
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L4_1 = 652001
L5_1 = 652004
L6_1 = 652006
L7_1 = 652008
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 652002
L5_1 = 652005
L3_1[1] = L4_1
L3_1[2] = L5_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_MONSTER_DIE_652003"
L3_1[1] = L4_1
L2_1.triggers = L3_1
L3_1 = {}
L4_1 = 652007
L3_1[1] = L4_1
L2_1.npcs = L3_1
L2_1.rand_weight = 100
L1_1[1] = L2_1
suites = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2
  L2_2 = ScriptLib
  L2_2 = L2_2.GetGroupMonsterCount
  L3_2 = A0_2
  L2_2 = L2_2(L3_2)
  if L2_2 ~= 0 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_ANY_MONSTER_DIE_652003 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2, L6_2
  L2_2 = ScriptLib
  L2_2 = L2_2.SetGadgetStateByConfigId
  L3_2 = A0_2
  L4_2 = 652002
  L5_2 = GadgetState
  L5_2 = L5_2.Default
  L2_2 = L2_2(L3_2, L4_2, L5_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : set_gadget_state_by_configId"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = ScriptLib
  L2_2 = L2_2.MarkPlayerAction
  L3_2 = A0_2
  L4_2 = 4000
  L5_2 = 3
  L6_2 = 1
  L2_2 = L2_2(L3_2, L4_2, L5_2, L6_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : mark_playerAction"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = 0
  return L2_2
end
action_EVENT_ANY_MONSTER_DIE_652003 = L1_1