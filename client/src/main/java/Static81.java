import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cka", name = "x", descriptor = "[Lclient!hv;")
	public static ParticleSystem[] aClass8_Sub5Array1;

	@OriginalMember(owner = "client!cka", name = "q", descriptor = "I")
	public static int anInt1644;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IB)V")
	public static void method1586(@OriginalArg(0) int arg0) {
		if (Static283.gameState == arg0) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static670.method8735();
		}
		if (arg0 != 14 && Static467.aClass348_2 != null) {
			Static467.aClass348_2.method7926();
			Static467.aClass348_2 = null;
		}
		if (arg0 == 3) {
			Static456.method6228(Static65.aClass3_1.anInt88 != Static377.anInt5930);
		}
		if (arg0 == 7) {
			Static25.method688(Static65.aClass3_1.anInt82 != Static377.anInt5930);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static369.method3852();
		} else if (arg0 == 6 || arg0 == 9 && Static283.gameState != 10) {
			Static670.method8735();
		}
		if (Static594.method7782(Static283.gameState)) {
			client.config.discardUnpacked = 2;
			client.configEnum.discardUnpacked = 2;
			client.configLoc.discardUnpacked = 2;
			client.configNpc.discardUnpacked = 2;
			client.configObj.discardUnpacked = 2;
			client.configSeq.discardUnpacked = 2;
			client.configSpot.discardUnpacked = 2;
		}
		if (Static594.method7782(arg0)) {
			Static593.anInt8763 = 0;
			Static357.anInt6508 = 1;
			Static440.anInt6683 = 1;
			Static213.anInt3472 = 0;
			Static13.anInt150 = 0;
			Static668.method8700(true);
			client.config.discardUnpacked = 1;
			client.configEnum.discardUnpacked = 1;
			client.configLoc.discardUnpacked = 1;
			client.configNpc.discardUnpacked = 1;
			client.configObj.discardUnpacked = 1;
			client.configSeq.discardUnpacked = 1;
			client.configSpot.discardUnpacked = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static314.method4562();
		}
		@Pc(213) boolean local213 = arg0 == 2 || Static41.method1027(arg0) || Static620.isInLobby(arg0);
		@Pc(235) boolean local235 = Static283.gameState == 2 || Static41.method1027(Static283.gameState) || Static620.isInLobby(Static283.gameState);
		if (local235 != local213) {
			if (local213) {
				Static588.anInt8692 = Static597.anInt8821;
				if (Static400.aClass2_Sub34_28.aPreference_Sub25_4.method7208() == 0) {
					Static312.method4541();
				} else {
					Static57.method1225(Static597.anInt8821, Static400.aClass2_Sub34_28.aPreference_Sub25_4.method7208(), client.midiSongs);
					Static550.method7266();
				}
				client.js5NetQueue.method6626(false);
			} else {
				Static312.method4541();
				client.js5NetQueue.method6626(true);
			}
		}
		if (Static594.method7782(arg0) || arg0 == 14 || arg0 == 15) {
			Static163.aClass19_17.method7969();
		}
		Static283.gameState = arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Lclient!aj;")
	public static SecondaryLinkable_Sub2 method1587() {
		@Pc(17) SecondaryLinkable_Sub2 local17 = (SecondaryLinkable_Sub2) Static138.aSecondaryLinkedList6.head();
		if (local17 != null) {
			local17.unlink();
			local17.unlinkSecondary();
			return local17;
		}
		do {
			local17 = (SecondaryLinkable_Sub2) Static59.aSecondaryLinkedList9.head();
			if (local17 == null) {
				return null;
			}
			if (local17.method201() > Static588.method7715()) {
				return null;
			}
			local17.unlink();
			local17.unlinkSecondary();
		} while ((local17.secondaryKey & Long.MIN_VALUE) == 0L);
		return local17;
	}

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(I)V")
	public static void method1589() {
		Static345.method5049();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)V")
	public static void method1591(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) OutboundPacket local8 = Static273.method3962();
		local8.buffer.p1(Static572.aLoginProt58.opcode);
		local8.buffer.p2(0);
		@Pc(25) int local25 = local8.buffer.pos;
		local8.buffer.p2(667);
		@Pc(38) int[] local38 = Static664.method8652(local8);
		@Pc(42) int local42 = local8.buffer.pos;
		local8.buffer.pjstr(arg0);
		local8.buffer.p2(Static323.anInt5121);
		local8.buffer.pjstr(arg2);
		local8.buffer.p8(Static416.aLong208);
		local8.buffer.p1(Static51.anInt1052);
		local8.buffer.p1(Static392.aModeGame4.id);
		Static176.method6690(local8.buffer);
		@Pc(81) String local81 = Static389.aString64;
		local8.buffer.p1(local81 == null ? 0 : 1);
		if (local81 != null) {
			local8.buffer.pjstr(local81);
		}
		local8.buffer.p1(arg1);
		local8.buffer.p1(arg3 ? 1 : 0);
		local8.buffer.pos += 7;
		local8.buffer.tinyenc(local38, local42, local8.buffer.pos);
		local8.buffer.psize2(local8.buffer.pos - local25);
		Connection.lobbyConnection.queue(local8);
		Static720.anInt10865 = 0;
		Static580.anInt8621 = -3;
		Static654.anInt9739 = 0;
		Static6.anInt95 = 1;
		if (arg1 < 13) {
			Static477.aBoolean543 = true;
			Static358.method9190();
		}
	}
}
