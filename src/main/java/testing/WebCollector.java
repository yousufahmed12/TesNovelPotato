package testing;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

public class WebCollector {
	 public static void main(String args[])
	    {
		 String urlFirst = "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-1/7330940/";
		 
		 String[] urlList = new String[] {"https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-211/8428016/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-210/8416134/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-209/8404955/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-208/8404954/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-207/8382703/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-206/8376206/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-205/8376205/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-204/7652017/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-203/7652016/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-202/7652015/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-201/7652014/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-200/7652013/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-199/7652012/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-198/7652011/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-197-Exitus/7652010/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-196-Exitus/7652009/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-195/7652008/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-194/7652007/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-193/7652006/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-192/7652005/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-191/7415870/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-190/7415869/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-189/7415868/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-188/7415867/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-187/7415866/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-186/7415865/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-185/7415864/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-184/7415863/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-183/7415862/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-182/7415861/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-181/7415860/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-180/7415859/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-179/7415858/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-178/7415857/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-177/7415856/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-176-Semi-Final-Round1/7415855/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-175/7415854/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-174-Reaching-The-Semi/7415853/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-173/7415852/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-172/7415851/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-171/7415850/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-170/7415849/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-169/7331109/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-168/7331108/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-167/7331107/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-166/7331106/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-165/7331105/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-164/7331104/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-163/7331103/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-162/7331102/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-161/7331101/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-160/7331100/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-159/7331099/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-158/7331098/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-157/7331097/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-156/7331096/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-155/7331095/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-154/7331094/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-153/7331093/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-152/7331092/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-151/7331091/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-150/7331090/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-149/7331089/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-148/7331088/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-147/7331087/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-146/7331086/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-145-Beginning-Of-Inter/7331085/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-144/7331084/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-143/7331083/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-142/7331082/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-141/7331081/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-140/7331080/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-139/7331079/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-138/7331078/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-137/7331077/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-136/7331076/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-135/7331075/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-134/7331074/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-133/7331073/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-132/7331072/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-131/7331071/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-130/7331070/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-129/7331069/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-128/7331068/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-127/7331067/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-126/7331066/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-125/7331065/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-124/7331064/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-123/7331063/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-122/7331062/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-121-2/7331061/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-121-1/7331060/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-120/7331059/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-119/7331058/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-118/7331057/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-117/7331056/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-116/7331055/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-115/7331054/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-114/7331053/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-113/7331052/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-112/7331051/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-111/7331050/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-110/7331049/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-109/7331048/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-108/7331047/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-107/7331046/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-106/7331045/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-105/7331044/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-104/7331043/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-103/7331042/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-102/7331041/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-101/7331040/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-100/7331039/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-99/7331038/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-98/7331037/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-97/7331036/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-96/7331035/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-95/7331034/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-94/7331033/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-93-2/7331032/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-92-2/7331031/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-91/7331030/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-90/7331029/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-89/7331028/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-88/7331027/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-87/7331026/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-86/7331025/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-85/7331024/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-84/7331023/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-83/7331022/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-82/7331021/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-81/7331020/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-80/7331019/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-79/7331018/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-78/7331017/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-77/7331016/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-76/7331015/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-75/7331014/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-74/7331013/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-73/7331012/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-72/7331011/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-71/7331010/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-70/7331009/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-69/7331008/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-68/7331007/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-67/7331006/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-66/7331005/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-65/7331004/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-64/7331003/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-63/7331002/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-62/7331001/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-61/7331000/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-60/7330999/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-59/7330998/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-58/7330997/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-57/7330996/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-56/7330995/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-55/7330994/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-54/7330993/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-53/7330992/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-52/7330991/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-51/7330990/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-50/7330989/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-49/7330988/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-48/7330987/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-47/7330986/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-46/7330985/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-45/7330984/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-44/7330983/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-43/7330982/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-42/7330981/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-41/7330980/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-40/7330979/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-39/7330978/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-38/7330977/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-37/7330976/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-36/7330975/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-35/7330974/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-34/7330973/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-33/7330972/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-32-Bonus-Chapter-/7330971/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-31/7330970/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-30/7330969/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-29/7330968/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-28/7330967/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-27/7330966/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-26/7330965/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-25/7330964/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-24/7330963/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-23/7330962/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-22/7330961/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-21/7330960/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-20/7330959/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-19/7330958/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-18/7330957/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-17/7330956/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-16/7330955/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-15/7330954/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-14/7330953/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-13/7330952/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-12/7330951/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-11/7330950/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-10/7330949/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-9/7330948/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-8/7330947/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-7/7330946/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-6/7330945/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-5/7330944/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-4/7330943/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-3/7330942/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-2/7330941/",
				 "https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-1/7330940/"};
;
	        try {
	        	
	        	String original = "C:\\Users\\thuin\\OneDrive\\Documents\\test2\\test.docx";
		    	
		    	String fileChange = "C:\\Users\\thuin\\OneDrive\\Documents\\test3\\The Extra's Survival Chapter ";
		  
		    	Document document = new Document(original);
		    	
	        	for(int k = 0; k < urlList.length; k++) {
	  
	            // Create URL object
	            URL url = new URL(urlList[k]);
	            BufferedReader readr = 
	              new BufferedReader(new InputStreamReader(url.openStream()));
	  
	            // Enter filename in which you want to download
	            BufferedWriter writer = 
	              new BufferedWriter(new FileWriter("Download.html"));
	              
	            // read each line from stream till end
	            String line;
	            String firstLineTitle="";
	            int i = 0;
	            while ((line = readr.readLine()) != null) {
	            	if(i == 202) {
	            		firstLineTitle = urlList[k];
	            		firstLineTitle = firstLineTitle.replaceAll("https://www.novelcool.com/chapter/The-Extra-x27-s-Survival-Chapter-", "");
	            		firstLineTitle = firstLineTitle.substring(0, firstLineTitle.indexOf("/"));
	            	}
	                //writer.write(line);
	            	i++;
	            	if(i == 206) {
	            		String Chapter = "The Extra's Survival Chapter " + firstLineTitle + "</p>" + line + "Chapterend";
	            		System.out.println(firstLineTitle);
	            		System.out.println(k + " " +line);
	            		InputStream is = new ByteArrayInputStream(Chapter.getBytes(StandardCharsets.UTF_8));
	            		document.loadText(is);
	            		document.saveToFile(fileChange + firstLineTitle + ".docx", FileFormat.Docx);
	            		break;
	            	}
	            }
	  
	            readr.close();
	            writer.close();
	            System.out.println("Successfully Downloaded.");
	        	}
	        }
	  
	        // Exceptions
	        catch (MalformedURLException mue) {
	            System.out.println("Malformed URL Exception raised");
	        }
	        catch (IOException ie) {
	            System.out.println("IOException raised");
	        }
	    }
}