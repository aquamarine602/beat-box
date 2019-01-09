package beat_box;

/**
 * @author chloe.spilker
 * 1/9/19
 */

import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BeatBox {
	JPanel mainPanel;
	ArrayList<JCheckBox> checkboxList;
	Sequencer sequencer;
	Sequence sequence;
	Track track;
	JFrame theFrame;
	String [] instrumentNames = {"Bass Drum", "closed Hi-Hat", "open Hi-Hat",
			"Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom", "High Bongo",
			"Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-Mid Tom",
			"High Agogo", "Open Hi Conga"};
	int [] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

	public void buildGui() {
		theFrame = new JFrame("Cyber BeatBox");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		JPanel background = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		checkboxList = new ArrayList<JCheckBox>();
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		
		JButton start = new JButton("Start");
		start.addActionListener(new MyStartListener());
		buttonBox.add(start);
		
		JButton stop = new JButton("Stop");
		start.addActionListener(new MyStopListener());
		buttonBox.add(stop);
		
		
	}
}


