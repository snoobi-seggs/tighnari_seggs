package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.PlayerWorldSceneInfoListNotifyOuterClass.PlayerWorldSceneInfoListNotify;
import emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass;
import emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo;

import static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PacketPlayerWorldSceneInfoListNotify extends BasePacket {
	
	public PacketPlayerWorldSceneInfoListNotify() {
		super(PacketOpcodes.PlayerWorldSceneInfoListNotify); // Rename opcode later

		PlayerWorldSceneInfoListNotify.Builder proto = PlayerWorldSceneInfoListNotify.newBuilder()
				.addInfoList(
						PlayerWorldSceneInfo.newBuilder()
								.setSceneId(1)
								.setIsLocked(false)
								.build()
				)
				.addInfoList(
						PlayerWorldSceneInfo.newBuilder()
								.setSceneId(3)
								.setIsLocked(false)
								.addSceneTagIdList(102)
								.addSceneTagIdList(113)
								.addSceneTagIdList(117)
								.addSceneTagIdList(1093) // Vanarana (real)
								//.addSceneTagIdList(1094) // Vanarana (dream))
								//.addSceneTagIdList(1095) // Vanarana (first))
								//.addSceneTagIdList(1096) // Vanarana (festival))
								//.addAllSceneTagIdList(IntStream.range(1000, 2000).boxed().collect(Collectors.toList()))
								.build()
				)
				.addInfoList(
						PlayerWorldSceneInfo.newBuilder()
								.setSceneId(4)
								.setIsLocked(false)
								.addSceneTagIdList(106)
								.addSceneTagIdList(109)
								.addSceneTagIdList(117)
								.build()
				)
				.addInfoList(
						PlayerWorldSceneInfo.newBuilder()
								.setSceneId(5)
								.setIsLocked(false)
								.build()
				)
				.addInfoList(
						PlayerWorldSceneInfo.newBuilder()
								.setSceneId(6)
								.setIsLocked(false)
								.build()
				)
				.addInfoList(
						PlayerWorldSceneInfo.newBuilder()
								.setSceneId(7)
								.setIsLocked(false)
								.build()
				);

		var gaa = PlayerWorldSceneInfo.newBuilder()
				.setSceneId(9)
				.setIsLocked(false);
		for(int i = 0; i < 3000; i++) {
			gaa.addSceneTagIdList(i);
		}

		/*var bigWorld = PlayerWorldSceneInfo.newBuilder()
				.setSceneId(3)
				.setIsLocked(false);
		for(int i = 0; i < 3000; i++) {
			bigWorld.addSceneTagIdList(i);
		}*/

		proto.addInfoList(gaa);

		this.setData(proto);
	}
}
