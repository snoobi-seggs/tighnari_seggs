local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1
L0_1 = {}
L0_1.group_id = 155005278
L1_1 = {}
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L3_1.config_id = 278001
L3_1.monster_id = 22010301
L4_1 = {}
L4_1.x = 370.604
L4_1.y = 230.36
L4_1.z = 149.562
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 21.717
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 36
L3_1.drop_tag = "\230\183\177\230\184\138\230\179\149\229\184\136"
L3_1.area_id = 200
L4_1 = {}
L4_1.config_id = 278002
L4_1.monster_id = 22010201
L5_1 = {}
L5_1.x = 368.814
L5_1.y = 230.658
L5_1.z = 154.502
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 91.604
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 36
L4_1.drop_tag = "\230\183\177\230\184\138\230\179\149\229\184\136"
L4_1.area_id = 200
L2_1[1] = L3_1
L2_1[2] = L4_1
L1_1.monsters = L2_1
L2_1 = {}
L3_1 = {}
L3_1.config_id = 278004
L3_1.gadget_id = 70211102
L4_1 = {}
L4_1.x = 366.66
L4_1.y = 230.718
L4_1.z = 150.812
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 62.439
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 16
L3_1.drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\168\187\229\166\187"
L4_1 = GadgetState
L4_1 = L4_1.ChestTrap
L3_1.state = L4_1
L3_1.isOneoff = true
L3_1.persistent = true
L4_1 = {}
L4_1.name = "chest"
L4_1.exp = 1
L3_1.explore = L4_1
L3_1.area_id = 200
L2_1[1] = L3_1
L1_1.gadgets = L2_1
L2_1 = {}
L3_1 = {}
L3_1.config_id = 278005
L4_1 = RegionShape
L4_1 = L4_1.SPHERE
L3_1.shape = L4_1
L3_1.radius = 5
L4_1 = {}
L4_1.x = 368.882
L4_1.y = 230.267
L4_1.z = 152.129
L3_1.pos = L4_1
L3_1.area_id = 200
L2_1[1] = L3_1
L1_1.regions = L2_1
L2_1 = {}
L3_1 = {}
L3_1.config_id = 1278005
L3_1.name = "ENTER_REGION_278005"
L4_1 = EventType
L4_1 = L4_1.EVENT_ENTER_REGION
L3_1.event = L4_1
L3_1.source = ""
L3_1.condition = "condition_EVENT_ENTER_REGION_278005"
L3_1.action = "action_EVENT_ENTER_REGION_278005"
L4_1 = {}
L4_1.config_id = 1278006
L4_1.name = "ANY_MONSTER_DIE_278006"
L5_1 = EventType
L5_1 = L5_1.EVENT_ANY_MONSTER_DIE
L4_1.event = L5_1
L4_1.source = ""
L4_1.condition = "condition_EVENT_ANY_MONSTER_DIE_278006"
L4_1.action = "action_EVENT_ANY_MONSTER_DIE_278006"
L2_1[1] = L3_1
L2_1[2] = L4_1
L1_1.triggers = L2_1
garbages = L1_1
L1_1 = {}
L1_1.suite = 1
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L2_1.monsters = L3_1
L3_1 = {}
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L3_1 = {}
L4_1 = {}
L3_1.monsters = L4_1
L4_1 = {}
L3_1.gadgets = L4_1
L4_1 = {}
L3_1.regions = L4_1
L4_1 = {}
L3_1.triggers = L4_1
L3_1.rand_weight = 100
L1_1[1] = L2_1
L1_1[2] = L3_1
suites = L1_1