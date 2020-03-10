package ie.cct.objectorientedconstructs.s2018370s2018092;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

public class FeedFactory implements FeedFactoryInterface {

	@Override
	public FeedInterface createFeed(BufferedReader in) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder data = new StringBuilder();
		String EOF ="";
		
		do {
			EOF = in.readLine();
			if(EOF != null) {
				data.append(EOF += "\n");
			}
		}while(EOF !=null);
		
		String[] item = data.toString().split("\\n");
		
		List<FeedItem> feeds = new ArrayList<>();
		String title;
		String content;
		
		for(int i=0; i<item.length; i+=2) {
			title = item[1];
			content = item[i+1];
			feeds.add(new FeedItem(title, content));
		}
		return null;
	}

}
