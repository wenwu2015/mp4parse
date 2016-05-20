package org.mp4parser.examples.metadata;

import org.mp4parser.IsoFile;
import org.mp4parser.boxes.UserBox;
import org.mp4parser.boxes.apple.AppleNameBox;
import org.mp4parser.boxes.iso14496.part12.MediaDataBox;
import org.mp4parser.boxes.iso14496.part12.MovieHeaderBox;
import org.mp4parser.tools.Path;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Change metadata and make sure chunkoffsets are corrected.
 */
public class MetaDataRead {


    public static void main(String[] args) throws IOException {
        MetaDataRead cmd = new MetaDataRead();
        String xml = cmd.read("C:\\Users\\Administrator\\Desktop\\2_1\\inject_1 - ¸±±¾.mp4");
        if(xml==null)
        	xml="data is NULL !!!";
        System.err.println(xml);
    }

    public String read(String videoFilePath) throws IOException {

        File videoFile = new File(videoFilePath);
        if (!videoFile.exists()) {
            throw new FileNotFoundException("File " + videoFilePath + " not exists");
        }

        if (!videoFile.canRead()) {
            throw new IllegalStateException("No read permissions to file " + videoFilePath);
        }
        IsoFile isoFile = new IsoFile(new FileInputStream(videoFilePath).getChannel());

        String  data="";
        
        
        
        
       // MovieHeaderBox movieHeaderBox=Path.getPath(isoFile, "moov[0]/mvhd");
       // data=movieHeaderBox.getSelectionDuration()+"";
        
        //MediaDataBox mdat=Path.getPath(isoFile,"mdat");
       // data=mdat.;
        
        //UserBox uuidBox = Path.getPath(isoFile, "moov[0]/trak[0]/uuid");
        //String  data=new String(uuidBox.getData());
        //String xml = nam.getValue();
        isoFile.close();
        return data;
    }
}
