package testing;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EmotionChooser {
	
	private static String[] emotions = {
            "Meh",
            "Yelling",
            "Neutral",
            "Positive",
            "Flirt",
            "Smug",
            "Grin",
            "Sad",
            "Happy"
        };
	
	private static Map<String, Integer> emotionImageMap = new HashMap<String, Integer>();
	
	private static String inputPath = "C:\\Users\\thuin\\OneDrive\\Desktop\\RwbyFaceChange\\Images\\";
	
	private static String outputPath = "C:\\Users\\thuin\\OneDrive\\Desktop\\RwbyFaceChange\\";

    public static void main(String[] args) {

		for (int i = 0; i < emotions.length; i++) {
			emotionImageMap.put(emotions[i], i + 1);
		}
        
        SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowEmotionChooser();
			}
		});
    }

    private static void createAndShowEmotionChooser() {
        JFrame frame = new JFrame("Emotion Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        final JComboBox<String> emotionComboBox = new JComboBox<String>(emotions);

        JButton selectButton = new JButton("Select");
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedEmotion = (String) emotionComboBox.getSelectedItem();
                if (selectedEmotion != null) {
                    showImagePopup(selectedEmotion);
                }
            }
        });
        
        String[] characters = {"Ruby", "Weiss","Blake","Yang"};
        final JComboBox<String> charactersComboBox = new JComboBox<String>(characters);
        
        JButton applyButton = new JButton("Apply");
        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCharacter = (String) charactersComboBox.getSelectedItem();
                
                String selectedEmotion = (String) emotionComboBox.getSelectedItem();
                
                Integer mouthNumber = emotionImageMap.get(selectedEmotion);
                
                if (selectedCharacter != null && mouthNumber != null) {
                	combineImages(selectedCharacter,mouthNumber);
                }
            }
        });

        JPanel emotionPanel = new JPanel();
        emotionPanel.setLayout(new BoxLayout(emotionPanel, BoxLayout.Y_AXIS));
        emotionPanel.add(emotionComboBox);
        emotionPanel.add(selectButton);

        JPanel charactersPanel = new JPanel();
        charactersPanel.setLayout(new BoxLayout(charactersPanel, BoxLayout.Y_AXIS));
        charactersPanel.add(charactersComboBox);
        charactersPanel.add(applyButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(emotionPanel, BorderLayout.NORTH);
        mainPanel.add(charactersPanel, BorderLayout.SOUTH);
        
        frame.getContentPane().add(mainPanel);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void showImagePopup(String emotion) {
        JFrame imageFrame = new JFrame(emotion + " Image");
        imageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String imagePath = inputPath + "mouth" + emotionImageMap.get(emotion) + ".png";
        if (imagePath != null) {
            ImageIcon icon = new ImageIcon(imagePath);
            JLabel label = new JLabel(icon);

            imageFrame.getContentPane().add(label);
            imageFrame.pack();
            imageFrame.setLocationRelativeTo(null);
            imageFrame.setVisible(true);
        }
    }
    
    public static void combineImages(String characterName, int mouthNumber) {
        try {
        	
            // Load the face image
            BufferedImage faceImage = ImageIO.read(new File(inputPath + characterName +".png"));

            // Load the mouth image
            BufferedImage mouthImage = ImageIO.read(new File(inputPath + "mouth" + mouthNumber + ".png"));

            // Create a new BufferedImage to hold the combined image
            BufferedImage combinedImage = new BufferedImage(
                    faceImage.getWidth(), faceImage.getHeight(), BufferedImage.TYPE_INT_ARGB);

            // Get the Graphics2D object to draw on the combined image
            Graphics2D g2d = combinedImage.createGraphics();

            // Draw the face image onto the combined image
            g2d.drawImage(faceImage, 0, 0, null);

            // Draw the mouth image onto the combined image
            g2d.drawImage(mouthImage, 195, 323, null); // Replace xCoordinate and yCoordinate with the appropriate values

            // Dispose of the Graphics2D object
            g2d.dispose();

            // Save the combined image to a new PNG file
            ImageIO.write(combinedImage, "png", new File(outputPath + "combineImageOutput.png"));

            System.out.println("Images combined successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
