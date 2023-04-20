package testing;

import java.io.IOException;
import java.util.List;
import org.languagetool.JLanguageTool;
import org.languagetool.language.BritishEnglish;
import org.languagetool.rules.RuleMatch;
public class GrammarTesting {

	public static void main(String[] args) {
		JLanguageTool jLanguageTool = new JLanguageTool(new BritishEnglish());
		try {
		    String test = "The Extra's Survival Chapter 1\r\n"
		    		+ "\"Son, have you checked the documents needed?\"\r\n"
		    		+ "\r\n"
		    		+ "\" Son, have you taken your handkerchief?\"\r\n"
		    		+ "\r\n"
		    		+ "\" Son, have you taken your wallet?\"\r\n"
		    		+ "\r\n"
		    		+ "\"Aaahh, Mom just stop it. I am not a four year kid going to school for the first time and I am already late so stop delaying me. \"\r\n"
		    		+ "\r\n"
		    		+ "\"Tsk, you are the one who still read manga, comics and stay late up to night and play video games even you are already 28.\"\r\n"
		    		+ "\r\n"
		    		+ "\" Yeah I understand. So stop pestering me Ok.\"\r\n"
		    		+ "\r\n"
		    		+ "\"Bye.\"\r\n"
		    		+ "\r\n"
		    		+ "With that I left but who knew that would be the last time I will be seeing my mother.\r\n"
		    		+ "\r\n"
		    		+ "After closing the door with a loud bang, I started running calling for a taxi but the luck didn't seem to be on my side today, after walking for quite some time, I gave up hope of finding the taxi.\r\n"
		    		+ "\r\n"
		    		+ "Walking for 15 minutes. I arrived at the central plaza.\r\n"
		    		+ "\r\n"
		    		+ "Waiting for the signal I looked for time. It was still 30 minutes for the interview. I was about to take a step when a car suddenly got out of the road hurling towards.\r\n"
		    		+ "\r\n"
		    		+ "'Shit.' Cursing my luck, I started to run out of instinct, screaming about the car coming towards here but too many people were blocking my way. I tried to push through the crowd to avoid the car but...\r\n"
		    		+ "\r\n"
		    		+ "I tried to scream on top of my voice but before I could say anything, my surroundings turned dark as the car crashed on us taking the life of many.\r\n"
		    		+ "\r\n"
		    		+ "\"Nooooooooooooo.\"\r\n"
		    		+ "\r\n"
		    		+ "Panting hard, I woke up.\r\n"
		    		+ "\r\n"
		    		+ "Taking a deep breath I checked my body and the surrounding.\r\n"
		    		+ "\r\n"
		    		+ "'Thank God... I am alive but where am I.'\r\n"
		    		+ "\r\n"
		    		+ "I thought someone have saved me and brought me to the hospital but I found myself in the room which looked most probably a hotel.\r\n"
		    		+ "\r\n"
		    		+ "Waking up from the bed, I walked towards the mirror on the side. Stumbling on the way with an exhausted body I looked at myself in the mirror but what reflected on the mirror was not my face.\r\n"
		    		+ "\r\n"
		    		+ "The image was not me but a young boy of roughly 15-16 years old with dark black hair along with golden eyes.\r\n"
		    		+ "\r\n"
		    		+ "The figure could be called handsome if not for the skinny body and eyes which looked like zombies.\r\n"
		    		+ "\r\n"
		    		+ "It seems as if this boy had not slept for an entire month or was suffering from a disease.\r\n"
		    		+ "\r\n"
		    		+ "But what happened to my body. I am 28 years old and was on my way for an interview before the accident and now I am finding myself in the body of a teenage boy.\r\n"
		    		+ "\r\n"
		    		+ "'Am I going through some virtual reality experiment because my brain cells are damaged or I am having dreams of another world?'\r\n"
		    		+ "\r\n"
		    		+ "To figure out the situation I opened the window, the warm sunshine engulfed my body giving me a warm feeling.\r\n"
		    		+ "\r\n"
		    		+ "The view outside the window was hard to describe by words. The place looks futuristic with touche of the middle ages. There were trains and high-tech bikes on road with tall buildings almost reaching the sky and there was also a giant castle floating on the island above the city. It looked like magic mixed with science\r\n"
		    		+ "\r\n"
		    		+ "I tried to recall the scene which seems to be familiar, at the same time unbelievable. I couldn't remember clearly where I have seen or listened to this, while a sudden headache started to assault me with random pieces of memories of the previous body stuffing inside my brain.\r\n"
		    		+ "\r\n"
		    		+ "The sudden influx of memories caused my vision to be blurry as I leaned over the wall sitting down for a moment. After a moment of rest, the pain which was rampaging on my mind started to subside slowly and I started calming my nerves recalling the pieces of memories that flashed in my head during the pain.\r\n"
		    		+ "\r\n"
		    		+ "The body of the previous owner according to memories belong to a middle-class family.\r\n"
		    		+ "\r\n"
		    		+ "His father was a 4 stars rank warrior and was a member of a small mercenary while his mother was 3 star in rank. After giving birth to him they retired from thier jobs and settled down in the land, they have on the outskirts of Capital and earned their living through farming. They were not poor as commoners and have a decent living.\r\n"
		    		+ "\r\n"
		    		+ "After resting for some time the pain which seemed to be intolerable almost subsided, I inhaled the fresh air and finally managed to get back on my feet.\r\n"
		    		+ "\r\n"
		    		+ "I glanced around the room looking for any minute detail that can help me know my situation. The room was a little shabby with only necessities with a clean bed with a desk beside it, a small clean bathroom.\r\n"
		    		+ "\r\n"
		    		+ "As I looked around my room had two luggage a smartphone and a smartwatch on the table.\r\n"
		    		+ "\r\n"
		    		+ "I tapped on the smartphone which showed my id-\r\n"
		    		+ "\r\n"
		    		+ "User ID: Lukas Brightt\r\n"
		    		+ "\r\n"
		    		+ "Course: Hero Course Year 1\r\n"
		    		+ "\r\n"
		    		+ "Status : First Year\r\n"
		    		+ "\r\n"
		    		+ "Bloodline Grade : Bronze\r\n"
		    		+ "\r\n"
		    		+ "[Horizon]\r\n"
		    		+ "\r\n"
		    		+ "\"Hmmm\".Seeing the name of the academy. I finally understand where is this place.\r\n"
		    		+ "\r\n"
		    		+ "It seems I have reincarnated into the last novel I was reading before dying, \"Dawn of legend\" and the person I have reincarnated doesn't even have a name that appeared in the novel.\r\n"
		    		+ "\r\n"
		    		+ "The earth of this place is different from the earth I used to live in. Mana and magic are natural for ages.\r\n"
		    		+ "\r\n"
		    		+ "Elves, humans, dwarves and demons were major species in this world. The peace that existed, in the beginning, was broken down by the demons unable to contain their greed as they wanted the whole world for themselves.\r\n"
		    		+ "\r\n"
		    		+ "Demons are born with an especially powerful physique and superior strength while elves were especially skilful in manipulating mana with nature abilities whereas dwarves were good at production while humans have a weak constitution, some have strong bloodline abilities but still, they need to train harder than others fraction.\r\n"
		    		+ "\r\n"
		    		+ "Humans have strong adaptability compared to other species and with the flow of time, they started to grow stronger though, in strength and controlling mana they were not as good as elves and demons respectively.\r\n"
		    		+ "\r\n"
		    		+ "All the species allied to form a United battlefront to repel the invasion of demons and fought countless battles to stop demon marching finally ensuring peace for common people but it was just temporary.\r\n"
		    		+ "\r\n"
		    		+ "To ensure a steady supply of strong warriors and groom the talented individual to shoulder the burdens of the world many hero academies were found and each kingdom have at least one primary hero academy that chose the best of the best talent and groom them with the highest resources and facilities.\r\n"
		    		+ "\r\n"
		    		+ "Unlike other stories, although the concept of kings and kingdoms were present, technology still made its progress.\r\n"
		    		+ "\r\n"
		    		+ "People who were not able to utilise mana focused on scientific technologies.\r\n"
		    		+ "\r\n"
		    		+ "The modernization kept its growth along with warriors providing them with the best equipment, training facility and support.\r\n"
		    		+ "\r\n"
		    		+ "The protagonist of the novel is the son of a duke, who was extremely talented in spear and will become a legend earning the title of Spear Saint.\r\n"
		    		+ "\r\n"
		    		+ "Though he doesn't have an overbearing system to help him on his journey, having been born in the duke's house gave him a head start compared to others along with the ancient artefact that he got before entering the academy.\r\n"
		    		+ "\r\n"
		    		+ "If someone asked what character is the person I am in now then I can only answer he is just extra.\r\n"
		    		+ "\r\n"
		    		+ "Even calling myself an extra lowers the remaining dignity an extra receive. Every novel has some named character while others' presence is just shown in numbers and I am just one of them.\r\n"
		    		+ "\r\n"
		    		+ "Just thinking of the ugly situation I have got myself gave me a headache.\r\n"
		    		+ "\r\n"
		    		+ "Closing my eyes I started imaging the face of my mother when she learns of my death. Tears started to flow out of my eyes. My hearted to pain thinking of mother.\r\n"
		    		+ "\r\n"
		    		+ "When people read reincarnation it has never mentioned the pain of departing from their family.\r\n"
		    		+ "\r\n"
		    		+ "Readers were just shown how the characters adapt to the new world. While reading and experiencing are just different things.\r\n"
		    		+ "\r\n"
		    		+ "As I find myself in a similar position, I finally understand how it feels of losing someone.\r\n"
		    		+ "\r\n"
		    		+ "Regrets started to swell up\"If just I have spent more time with my family If I have just behaved more properly with others etc\".But as there is a saying there are no ifs in life.\r\n"
		    		+ "\r\n"
		    		+ "Sigh...\r\n"
		    		+ "\r\n"
		    		+ "When I opened my eyes I found a virtual screen in front of me.\r\n"
		    		+ "\r\n"
		    		+ "Status\r\n"
		    		+ "\r\n"
		    		+ "Loading 34% : 3 hours to complete\r\n"
		    		+ "\r\n"
		    		+ "\"Hmmm\".\r\n"
		    		+ "\r\n"
		    		+ "A system.\r\n"
		    		+ "\r\n"
		    		+ "As far I can remember there was no system in the novel.\r\n"
		    		+ "\r\n"
		    		+ "It must be exclusively for me.\r\n"
		    		+ "\r\n"
		    		+ "A small hope started to grow within me.\r\n"
		    		+ "\r\n"
		    		+ "In this cruel world with no one to depend on, maybe this system help me.\r\n"
		    		+ "\r\n"
		    		+ "Taking a deep breath, I decided to drink water and sleep for a while.\r\n"
		    		+ "\r\n"
		    		+ "I was excited about what kind of system I would be getting when I opened my eyes.\r\n"
		    		+ "\r\n"
		    		+ "I pushed back the thought of figuring out this world to tomorrow.\r\n"
		    		+ "\r\n"
		    		+ "After all, what will come will come.\r\n"
		    		+ "\r\n"
		    		+ "Since I have already become a part of this world, I have to just give my all to survive and lead a fulfilling life.";
		    List<RuleMatch> ruleMatchList = jLanguageTool.check(test);
		    StringBuffer buf = new StringBuffer(test);
		    
		    for (RuleMatch ruleMatch : Reversed.reversed(ruleMatchList)) {
		        System.out.println("Grammar problem in the sentence: [" 
		            + ruleMatch.getSentence().getText() + "]");
		        System.out.println(ruleMatch.getMessage() + "'");
		        System.out.println("At Position: [" + ruleMatch.getFromPos() + "-"
		            + ruleMatch.getToPos() + "]");
		        System.out.println("Problem description: " +  
		            ruleMatch.getRule().getDescription());
		        int count = 1;
		        System.out.println("--- Possible Corrections ---");
		        for (String replacement : Reversed.reversed(ruleMatch.getSuggestedReplacements())) {
		            System.out.println("Correction " + count++ + ": " + replacement);
		            int start = ruleMatch.getFromPos();
		            int end = ruleMatch.getToPos();
		            buf = buf.replace(start, end, replacement); 
		            break;
		        }
		        System.out.println(buf);
		        System.out.println();
		    }
		} catch (IOException ex) {
		    // Handle exceptions
		}

	}
}
