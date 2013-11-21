package bf4jsonmapping;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import bf4xmlMapping.cheatcheck.CheatCheck;
import bf4xmlMapping.cheatcheck.Weapons;

import com.cooksys.xml.utils.context.CXUContext;
import com.cooksys.xml.utils.context.ContextFactory;
import com.google.gson.Gson;

public class TestGson {
	
	public static void main(String[] arg0){
		Gson gson = new Gson();
		
		String tmpString = "{\"status\":\"success\",\"serverinfo\":{\"servername\":\"=ADK= #3 | Conquest Large 1000 Tickets | ADKGamers.com |\",\"currentplayers\":55,\"maxplayers\":64,\"round\":\"0h 5m 32s\",\"uptime\":\"0d 17h 23m\",\"map\":{\"0\":\"Rogue Transmission\"},\"servertype\":\"RANKED\"},\"adminsonline\":[],\"teaminfo\":{\"1\":{\"playerlist\":[{\"playername\":\"biz0ink\",\"playerscore\":1645,\"playersquad\":\"Charlie\",\"playerkills\":5,\"playerdeaths\":3,\"playerteam\":1,\"playersquadid\":3,\"player_id\":26539,\"playerping\":39,\"playerrank\":21},{\"playername\":\"F34RMY5H0T\",\"playerscore\":1604,\"playersquad\":\"Alpha\",\"playerkills\":2,\"playerdeaths\":2,\"playerteam\":1,\"playersquadid\":1,\"player_id\":7956,\"playerping\":59,\"playerrank\":19},{\"playername\":\"HeHateMe403\",\"playerscore\":1516,\"playersquad\":\"India\",\"playerkills\":4,\"playerdeaths\":1,\"playerteam\":1,\"playersquadid\":9,\"player_id\":110231,\"playerping\":53,\"playerrank\":30},{\"playername\":\"Newbie_301\",\"playerscore\":1440,\"playersquad\":\"India\",\"playerkills\":1,\"playerdeaths\":2,\"playerteam\":1,\"playersquadid\":9,\"player_id\":110229,\"playerping\":51,\"playerrank\":35},{\"playername\":\"HappyId10t\",\"playerscore\":1385,\"playersquad\":\"Foxtrot\",\"playerkills\":3,\"playerdeaths\":2,\"playerteam\":1,\"playersquadid\":6,\"player_id\":114279,\"playerping\":31,\"playerrank\":16},{\"playername\":\"VeritechHT1\",\"playerscore\":1018,\"playersquad\":\"Bravo\",\"playerkills\":2,\"playerdeaths\":1,\"playerteam\":1,\"playersquadid\":2,\"player_id\":23039,\"playerping\":81,\"playerrank\":17},{\"playername\":\"CMYGTGO\",\"playerscore\":998,\"playersquad\":\"Echo\",\"playerkills\":2,\"playerdeaths\":2,\"playerteam\":1,\"playersquadid\":5,\"player_id\":114319,\"playerping\":16,\"playerrank\":11},{\"playername\":\"BDM13\",\"playerscore\":970,\"playersquad\":\"Alpha\",\"playerkills\":1,\"playerdeaths\":3,\"playerteam\":1,\"playersquadid\":1,\"player_id\":114409,\"playerping\":37,\"playerrank\":3},{\"playername\":\"XtraSpclCrspy\",\"playerscore\":949,\"playersquad\":\"Echo\",\"playerkills\":1,\"playerdeaths\":1,\"playerteam\":1,\"playersquadid\":5,\"player_id\":60938,\"playerping\":47,\"playerrank\":9},{\"playername\":\"ZankasWolfsbane\",\"playerscore\":850,\"playersquad\":\"Alpha\",\"playerkills\":3,\"playerdeaths\":3,\"playerteam\":1,\"playersquadid\":1,\"player_id\":114261,\"playerping\":64,\"playerrank\":25},{\"playername\":\"JazTheRogue\",\"playerscore\":760,\"playersquad\":\"Golf\",\"playerkills\":2,\"playerdeaths\":2,\"playerteam\":1,\"playersquadid\":7,\"player_id\":44302,\"playerping\":61,\"playerrank\":15},{\"playername\":\"stewvader1\",\"playerscore\":730,\"playersquad\":\"Golf\",\"playerkills\":1,\"playerdeaths\":1,\"playerteam\":1,\"playersquadid\":7,\"player_id\":78854,\"playerping\":20,\"playerrank\":17},{\"playername\":\"Garrettlhunt9\",\"playerscore\":715,\"playersquad\":\"Bravo\",\"playerkills\":2,\"playerdeaths\":0,\"playerteam\":1,\"playersquadid\":2,\"player_id\":114079,\"playerping\":105,\"playerrank\":8},{\"playername\":\"x_Heavy\",\"playerscore\":700,\"playersquad\":\"None\",\"playerkills\":0,\"playerdeaths\":0,\"playerteam\":1,\"playersquadid\":0,\"player_id\":114656,\"playerping\":55,\"playerrank\":12},{\"playername\":\"sesnir\",\"playerscore\":522,\"playersquad\":\"Charlie\",\"playerkills\":3,\"playerdeaths\":3,\"playerteam\":1,\"playersquadid\":3,\"player_id\":114741,\"playerping\":33,\"playerrank\":9},{\"playername\":\"Motox161\",\"playerscore\":517,\"playersquad\":\"Delta\",\"playerkills\":1,\"playerdeaths\":4,\"playerteam\":1,\"playersquadid\":4,\"player_id\":21984,\"playerping\":71,\"playerrank\":18},{\"playername\":\"SuperCritter\",\"playerscore\":494,\"playersquad\":\"Hotel\",\"playerkills\":1,\"playerdeaths\":4,\"playerteam\":1,\"playersquadid\":8,\"player_id\":98238,\"playerping\":34,\"playerrank\":7},{\"playername\":\"HPN_NOELL\",\"playerscore\":477,\"playersquad\":\"Alpha\",\"playerkills\":1,\"playerdeaths\":2,\"playerteam\":1,\"playersquadid\":1,\"player_id\":114652,\"playerping\":238,\"playerrank\":12},{\"playername\":\"Senekenn\",\"playerscore\":475,\"playersquad\":\"Foxtrot\",\"playerkills\":0,\"playerdeaths\":1,\"playerteam\":1,\"playersquadid\":6,\"player_id\":79096,\"playerping\":66,\"playerrank\":15},{\"playername\":\"Smyrf98\",\"playerscore\":395,\"playersquad\":\"Hotel\",\"playerkills\":1,\"playerdeaths\":0,\"playerteam\":1,\"playersquadid\":8,\"player_id\":58171,\"playerping\":89,\"playerrank\":28},{\"playername\":\"Neooen419\",\"playerscore\":312,\"playersquad\":\"Foxtrot\",\"playerkills\":1,\"playerdeaths\":4,\"playerteam\":1,\"playersquadid\":6,\"player_id\":114295,\"playerping\":73,\"playerrank\":3},{\"playername\":\"Sketchy_Peanut\",\"playerscore\":230,\"playersquad\":\"Delta\",\"playerkills\":1,\"playerdeaths\":3,\"playerteam\":1,\"playersquadid\":4,\"player_id\":114069,\"playerping\":53,\"playerrank\":1},{\"playername\":\"EJReston\",\"playerscore\":195,\"playersquad\":\"Echo\",\"playerkills\":1,\"playerdeaths\":2,\"playerteam\":1,\"playersquadid\":5,\"player_id\":114318,\"playerping\":15,\"playerrank\":3},{\"playername\":\"Raythalus\",\"playerscore\":155,\"playersquad\":\"Charlie\",\"playerkills\":0,\"playerdeaths\":2,\"playerteam\":1,\"playersquadid\":3,\"player_id\":114523,\"playerping\":67,\"playerrank\":6},{\"playername\":\"alexswegger\",\"playerscore\":140,\"playersquad\":\"Alpha\",\"playerkills\":0,\"playerdeaths\":1,\"playerteam\":1,\"playersquadid\":1,\"player_id\":114675,\"playerping\":159,\"playerrank\":15},{\"playername\":\"Balthaner\",\"playerscore\":0,\"playersquad\":\"Bravo\",\"playerkills\":0,\"playerdeaths\":0,\"playerteam\":1,\"playersquadid\":2,\"player_id\":114775,\"playerping\":179,\"playerrank\":15},{\"playername\":\"eLinoise_cL\",\"playerscore\":0,\"playersquad\":\"None\",\"playerkills\":0,\"playerdeaths\":0,\"playerteam\":1,\"playersquadid\":0,\"player_id\":96844,\"playerping\":192,\"playerrank\":23}],\"ticketcount\":1115},\"2\":{\"playerlist\":[{\"playername\":\"BURLYMACHINE\",\"playerscore\":3661,\"playersquad\":\"Charlie\",\"playerkills\":12,\"playerdeaths\":1,\"playerteam\":2,\"playersquadid\":3,\"player_id\":99313,\"playerping\":46,\"playerrank\":44},{\"playername\":\"JoeFinisher\",\"playerscore\":1331,\"playersquad\":\"Echo\",\"playerkills\":7,\"playerdeaths\":3,\"playerteam\":2,\"playersquadid\":5,\"player_id\":109449,\"playerping\":42,\"playerrank\":31},{\"playername\":\"Basementsafe118\",\"playerscore\":1182,\"playersquad\":\"Echo\",\"playerkills\":3,\"playerdeaths\":2,\"playerteam\":2,\"playersquadid\":5,\"player_id\":91340,\"playerping\":64,\"playerrank\":16},{\"playername\":\"NIBGiZ\",\"playerscore\":1070,\"playersquad\":\"Golf\",\"playerkills\":3,\"playerdeaths\":2,\"playerteam\":2,\"playersquadid\":7,\"player_id\":23114,\"playerping\":10,\"playerrank\":23},{\"playername\":\"bukeyes56\",\"playerscore\":939,\"playersquad\":\"Foxtrot\",\"playerkills\":2,\"playerdeaths\":0,\"playerteam\":2,\"playersquadid\":6,\"player_id\":12496,\"playerping\":14,\"playerrank\":9},{\"playername\":\"ShoutAnimal\",\"playerscore\":846,\"playersquad\":\"Alpha\",\"playerkills\":0,\"playerdeaths\":3,\"playerteam\":2,\"playersquadid\":1,\"player_id\":114313,\"playerping\":119,\"playerrank\":6},{\"playername\":\"SilencedKilla\",\"playerscore\":844,\"playersquad\":\"Foxtrot\",\"playerkills\":2,\"playerdeaths\":1,\"playerteam\":2,\"playersquadid\":6,\"player_id\":14776,\"playerping\":61,\"playerrank\":27},{\"playername\":\"Commlink\",\"playerscore\":808,\"playersquad\":\"Foxtrot\",\"playerkills\":3,\"playerdeaths\":2,\"playerteam\":2,\"playersquadid\":6,\"player_id\":12557,\"playerping\":22,\"playerrank\":10},{\"playername\":\"CMsnlper\",\"playerscore\":780,\"playersquad\":\"Golf\",\"playerkills\":1,\"playerdeaths\":4,\"playerteam\":2,\"playersquadid\":7,\"player_id\":69569,\"playerping\":20,\"playerrank\":28},{\"playername\":\"HPN_Shrek\",\"playerscore\":661,\"playersquad\":\"Alpha\",\"playerkills\":4,\"playerdeaths\":4,\"playerteam\":2,\"playersquadid\":1,\"player_id\":114628,\"playerping\":196,\"playerrank\":17},{\"playername\":\"Diablos9999\",\"playerscore\":598,\"playersquad\":\"Foxtrot\",\"playerkills\":1,\"playerdeaths\":1,\"playerteam\":2,\"playersquadid\":6,\"player_id\":9660,\"playerping\":14,\"playerrank\":21},{\"playername\":\"Thathippie707\",\"playerscore\":595,\"playersquad\":\"Alpha\",\"playerkills\":1,\"playerdeaths\":2,\"playerteam\":2,\"playersquadid\":1,\"player_id\":97502,\"playerping\":77,\"playerrank\":20},{\"playername\":\"xXJKING07Xx\",\"playerscore\":545,\"playersquad\":\"Alpha\",\"playerkills\":0,\"playerdeaths\":2,\"playerteam\":2,\"playersquadid\":1,\"player_id\":114179,\"playerping\":29,\"playerrank\":3},{\"playername\":\"snortt\",\"playerscore\":485,\"playersquad\":\"Charlie\",\"playerkills\":1,\"playerdeaths\":1,\"playerteam\":2,\"playersquadid\":3,\"player_id\":57530,\"playerping\":\"--\",\"playerrank\":18},{\"playername\":\"OSIASLEE\",\"playerscore\":440,\"playersquad\":\"Echo\",\"playerkills\":1,\"playerdeaths\":3,\"playerteam\":2,\"playersquadid\":5,\"player_id\":109454,\"playerping\":58,\"playerrank\":17},{\"playername\":\"airsoftman123457\",\"playerscore\":345,\"playersquad\":\"Golf\",\"playerkills\":2,\"playerdeaths\":2,\"playerteam\":2,\"playersquadid\":7,\"player_id\":67600,\"playerping\":41,\"playerrank\":8},{\"playername\":\"ProtossMaster\",\"playerscore\":225,\"playersquad\":\"Delta\",\"playerkills\":2,\"playerdeaths\":0,\"playerteam\":2,\"playersquadid\":4,\"player_id\":289,\"playerping\":79,\"playerrank\":27},{\"playername\":\"McJamz\",\"playerscore\":189,\"playersquad\":\"Delta\",\"playerkills\":1,\"playerdeaths\":2,\"playerteam\":2,\"playersquadid\":4,\"player_id\":114230,\"playerping\":35,\"playerrank\":7},{\"playername\":\"Sabertooth_i7\",\"playerscore\":175,\"playersquad\":\"Alpha\",\"playerkills\":1,\"playerdeaths\":1,\"playerteam\":2,\"playersquadid\":1,\"player_id\":109766,\"playerping\":70,\"playerrank\":23},{\"playername\":\"Finsom\",\"playerscore\":173,\"playersquad\":\"Alpha\",\"playerkills\":0,\"playerdeaths\":0,\"playerteam\":2,\"playersquadid\":1,\"player_id\":99395,\"playerping\":66,\"playerrank\":15},{\"playername\":\"Baritek\",\"playerscore\":150,\"playersquad\":\"Echo\",\"playerkills\":1,\"playerdeaths\":0,\"playerteam\":2,\"playersquadid\":5,\"player_id\":114772,\"playerping\":186,\"playerrank\":20},{\"playername\":\"Ezswanson420\",\"playerscore\":150,\"playersquad\":\"Delta\",\"playerkills\":1,\"playerdeaths\":3,\"playerteam\":2,\"playersquadid\":4,\"player_id\":114753,\"playerping\":84,\"playerrank\":8},{\"playername\":\"Adr3NaLine12\",\"playerscore\":10,\"playersquad\":\"Charlie\",\"playerkills\":0,\"playerdeaths\":0,\"playerteam\":2,\"playersquadid\":3,\"player_id\":114773,\"playerping\":223,\"playerrank\":21},{\"playername\":\"RAAV09\",\"playerscore\":0,\"playersquad\":\"Bravo\",\"playerkills\":0,\"playerdeaths\":0,\"playerteam\":2,\"playersquadid\":2,\"player_id\":42965,\"playerping\":220,\"playerrank\":11},{\"playername\":\"ZetHk\",\"playerscore\":0,\"playersquad\":\"Charlie\",\"playerkills\":0,\"playerdeaths\":0,\"playerteam\":2,\"playersquadid\":3,\"player_id\":114767,\"playerping\":187,\"playerrank\":19}],\"ticketcount\":1097},\"0\":{\"playerlist\":[{\"playername\":\"S3nsualCL\",\"playerscore\":0,\"playersquad\":\"None\",\"playerkills\":0,\"playerdeaths\":0,\"playerteam\":0,\"playersquadid\":0,\"player_id\":114779,\"playerping\":181,\"playerrank\":18}]}},\"execuation_time\":\"0.2039\"}";
		
		B4Scoreboard scoreboard = null;
		
		CXUContext context = ContextFactory.createContext(null);
		
		context.bind(B4Scoreboard.class, CheatCheck.class);
		
//		String url = "http://gcp.adkgamers.com/api/bf4/scoreboard/1?format=xml";
		 
		String url = "http://gcp.adkgamers.com/api/bf4/playercheck/0/918949429?format=xml";
		
		URL obj;
		
		StringBuffer response;
		
		try {
			obj = new URL(url);
			
			Scanner scanner = new Scanner(obj.openStream());
			String response2 = scanner.useDelimiter("\\Z").next();
			
//			response2 = response2.replace("<xml>", "<B4Scoreboard>");
//			response2 = response2.replace("</xml>", "</B4Scoreboard>");
//			response2 = response2.replace("<teaminfo>", "");
//			response2 = response2.replace("</teaminfo>", "");
//			response2 = response2.replace("<item><playerlist>", "<teaminfo><playerlist>");
//			response2 = response2.replace("</playerlist></item>", "</playerlist></teaminfo>");
//			response2 = response2.replace("<item><playerlist/></item>", "<teaminfo><playerlist/></teaminfo>");
//			response2 = response2.replace("<item><ticketcount>", "<teaminfo><ticketcount>");
//			response2 = response2.replace("</ticketcount></item>", "</ticketcount></teaminfo>");
//			response2 = response2.replace("<playerlist>", "");
//			response2 = response2.replace("</playerlist>", "");
//			response2 = response2.replace("<item><playername>", "<playerlist><playername>");
//			response2 = response2.replace("</playerrank></item>", "</playerrank></playerlist>");
			
//			context.generateSchema();
			
			
			System.out.println(formatCheatCheckXml(response2));
			
			CheatCheck check = (CheatCheck) context.unmarshal(formatCheatCheckXml(response2));
			
			ArrayList<Weapons> wepList = check.getWeapons();
			
			for(Weapons wep : wepList){
				if(wep.getWeaponName().equals("scar-h")){
					System.out.println("Weapon HKR = " + wep.getHeadshots());
				}
			}
//			scoreboard = (B4Scoreboard) context.unmarshal(response2);
			
			scanner.close();
			
			

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
//		System.out.println(scoreboard.getTeaminfo().get(0).getPlayerlist().get(0).getPlayername());
//		
//		B4Scoreboard board = new B4Scoreboard();
//		BfTeam team = new BfTeam();
//		team.setPlayerlist(new ArrayList());
//		team.getPlayerlist().add(new Bf4Player());
//		team.getPlayerlist().add(new Bf4Player());
//		team.getPlayerlist().get(0).setPlayername("shozaku");
//		team.getPlayerlist().get(1).setPlayername("shozaku2");
//		team.setTicketcount("3");
//		board.setTeaminfo(new ArrayList());
//		board.getTeaminfo().add(team);
//		board.getTeaminfo().add(team);
//		System.out.println(context.marshal(board));
		

//		ArrayList<HashMap<String,Object>> playerLists = scoreboard.getPlayerLists();
		
		
		
//		System.out.println(playerLists);
//		
//		System.out.println("");
//		
//		System.out.println(playerLists.get(0).get("playername"));
//		System.out.println("");
//		System.out.println(scoreboard.getServerinfo().getServername());
//		
	}
	
	public static String formatCheatCheckXml(String xml) throws ParserConfigurationException, SAXException, IOException{
		String tmpString = null;
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new InputSource(new StringReader(xml)));
		
		Node root = doc.getFirstChild();
		
		doc.renameNode(root, null, "CheatCheck");
		
		
		Node weaponNode = doc.getElementsByTagName("weapons").item(0);
		
		NodeList nodes = weaponNode.getChildNodes();
		
		for(int x = 0; x < nodes.getLength(); x++){
			Node node = nodes.item(x);
			
			Element child = doc.createElement("weaponName");
			
			child.appendChild(doc.createTextNode(node.getNodeName()));
			
			node.appendChild(child);
			
			doc.renameNode(node, null, "weapons");
			
		}
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = null;
		try {
			transformer = tf.newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		StringWriter writer = new StringWriter();
		try {
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tmpString = writer.getBuffer().toString().replaceAll("\n|\r", "");
		
		tmpString = tmpString.trim().replace("<weapons><weapons>", "<weapons>");
		tmpString = tmpString.trim().replace("</weapons></weapons>", "</weapons>");
		
		
		
		return tmpString;
	}

}
