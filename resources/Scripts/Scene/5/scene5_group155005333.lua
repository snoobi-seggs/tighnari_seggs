local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1
L0_1 = {}
L0_1.group_id = 155005333
L1_1 = {}
L2_1 = {}
L2_1.config_id = 333001
L2_1.monster_id = 21010201
L3_1 = {}
L3_1.x = 353.582
L3_1.y = 175.562
L3_1.z = 163.822
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 308.307
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 36
L2_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L2_1.disableWander = true
L2_1.pose_id = 9002
L2_1.area_id = 200
L3_1 = {}
L3_1.config_id = 333007
L3_1.monster_id = 21010101
L4_1 = {}
L4_1.x = 355.742
L4_1.y = 174.638
L4_1.z = 160.136
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 223.939
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 36
L3_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L3_1.disableWander = true
L3_1.pose_id = 9012
L3_1.area_id = 200
L1_1[1] = L2_1
L1_1[2] = L3_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 333004
L2_1.gadget_id = 70310004
L3_1 = {}
L3_1.x = 351.796
L3_1.y = 175.612
L3_1.z = 162.604
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 0.0
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 36
L3_1 = GadgetState
L3_1 = L3_1.GearStart
L2_1.state = L3_1
L2_1.area_id = 200
L3_1 = {}
L3_1.config_id = 333005
L3_1.gadget_id = 70310001
L4_1 = {}
L4_1.x = 349.544
L4_1.y = 175.325
L4_1.z = 159.608
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 0.0
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 36
L4_1 = GadgetState
L4_1 = L4_1.GearStart
L3_1.state = L4_1
L3_1.area_id = 200
L4_1 = {}
L4_1.config_id = 333006
L4_1.gadget_id = 70310006
L5_1 = {}
L5_1.x = 350.623
L5_1.y = 176.003
L5_1.z = 165.596
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 0.0
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 36
L5_1 = GadgetState
L5_1 = L5_1.GearStart
L4_1.state = L5_1
L4_1.area_id = 200
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
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
L3_1.config_id = 333002
L3_1.gadget_id = 70211002
L4_1 = {}
L4_1.x = 354.415
L4_1.y = 174.671
L4_1.z = 158.328
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 2.001
L4_1.y = 31.242
L4_1.z = 349.945
L3_1.rot = L4_1
L3_1.level = 16
L3_1.drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\168\187\229\166\187"
L4_1 = GadgetState
L4_1 = L4_1.ChestLocked
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
L3_1.config_id = 1333003
L3_1.name = "ANY_MONSTER_DIE_333003"
L4_1 = EventType
L4_1 = L4_1.EVENT_ANY_MONSTER_DIE
L3_1.event = L4_1
L3_1.source = ""
L3_1.condition = "condition_EVENT_ANY_MONSTER_DIE_333003"
L3_1.action = "action_EVENT_ANY_MONSTER_DIE_333003"
L2_1[1] = L3_1
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
L4_1 = 333001
L5_1 = 333007
L3_1[1] = L4_1
L3_1[2] = L5_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 333004
L5_1 = 333005
L6_1 = 333006
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L1_1[1] = L2_1
suites = L1_1