package com.elenverve.handler;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.elenverve.dpo.MenuDpo;
import com.elenverve.exception.PropertiesException;

public class XmlPropertiesHandler extends PropertiesHandler{
	private static final Logger logger = Logger.getLogger(XmlPropertiesHandler.class);
	private static XmlPropertiesHandler handler=null;
	private String propertyFileName =null;
	private String propfileName ="resources.xml"; 
	protected Map<String,Object> properties = new HashMap<String,Object>();
	
	public Map<String, Object> getProperties() {
		return properties;
	}

	/**
	 * An instance is generated  
	 * @return
	 */
	public static XmlPropertiesHandler getInstance(){
		if(handler==null){
			handler = new XmlPropertiesHandler();
		}
		return handler;
	}
	
	public void initialize(List<Integer> types){
		try {
			for(Integer type: types){
				switch(type){ // if type is not 0 or 1 , resources.xml is read;
				case 0:{ //All
					logger.debug("Reading resources...");
					readPropertiesFile("resources.xml");
					logger.debug("Reading offers..");
					readPropertiesFile("offers.xml");
					logger.debug("done reading resources & offers..");
					break;
				}
				case 1:{ //Just resources.xml
					readPropertiesFile("resources.xml");
					break;
				}
				case 2:{ //Just offers.xml
					readPropertiesFile("offers.xml");
					break;
				}				
				}
			}
			
		} catch (Exception e) {
		 ////logger.debug("Exception in parsing properties file :"+propfileName+" Exception message [ "+e.getMessage()+" ]");
		}
	}
	
	
	/**
	 * This method reads a property file 
	 * @param fileName
	 * @throws PropertiesException
	 */
	protected void readPropertiesFile(String fileName) throws PropertiesException{
		propertyFileName =fileName;
		InputStream url=null;
		try {
			logger.debug("Opening property file ["+propertyFileName+"] ");
			url = getResourceFileStream(propertyFileName);
			SAXReader reader = new SAXReader();
			Document doc = reader.read(url);			
			Element root = doc.getRootElement();
			parse(root,false);			
		} catch (Exception e) {
			throw new PropertiesException(propertyFileName,	"Exception occured while extracting DOM document from xml",	e);
		}finally{
			try {				
				url.close();
				logger.debug("Property file ["+propertyFileName+"] closed..");
			} catch (IOException e) {
				throw new PropertiesException(propertyFileName,	"Exception occured while closing "+propertyFileName,	e);
			}
		}
	
	}
	/**
	 * This method reads a property file 
	 * @param fileName
	 * @throws PropertiesException
	 */
	public void loadProperties(URL fileName) throws PropertiesException{
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read(fileName);			
			Element root = doc.getRootElement();
			parse(root,true);
			
		} catch (Exception e) {
			throw new PropertiesException(fileName.toString(),	"Exception occured while extracting DOM document from xml",	e);
		}
	
	}
	/**
	 * Parsing sub menu items
	 * @param root
	 * @param menu
	 * @return
	 */
	private MenuDpo parseSubMenus(Element root,MenuDpo menu){
		ArrayList<Element> rootElements = new ArrayList<Element>(root.elements());
		for(Element elem:rootElements){
			////logger.debug(elem.getName());
			if(SUB_MENUS.toUpperCase().equals(elem.getName().toUpperCase())){
				parseSubMenus(elem, menu);
			}
			if(MENU.toUpperCase().equals(elem.getName().toUpperCase())){
				MenuDpo subMenu = new MenuDpo();
				subMenu.setDisplayName(elem.attributeValue("displayName"));
				subMenu.setHref(elem.attributeValue("href"));
				subMenu = parseSubMenus(elem,subMenu);
				menu.addSubMenu(subMenu);
			}
		}
		
		return menu;
	}
	/**
	 * Parsing menu items 
	 * @param root
	 * @return
	 */
	private List<MenuDpo> parseMenu(Element root){
		ArrayList<Element> rootElements = new ArrayList<Element>(root.elements());
		List<MenuDpo> menus = new LinkedList<MenuDpo>();
		
		for(Element elem:rootElements){
			logger.debug(""+elem.getName());
			if(MENU.toUpperCase().equals(elem.getName().toUpperCase())){
				MenuDpo menu = new MenuDpo();
				menu.setDisplayName(elem.attributeValue("displayName"));
				menu.setHref(elem.attributeValue("href"));
				menu= parseSubMenus(elem,menu);
				menus.add(menu);
			}else{
				parseMenu(elem);
			}
			
		}
		return menus;
	}
	
	/*
	private BannerDpo.Slide.Overlay parseCaptions(List<Element> elements,BannerDpo.Slide.Overlay overlay){
		for(Element elem:elements){
			List<Element> elems = elem.elements(TEXT);
			for(Element ele:elems){
				BannerDpo.Slide.Overlay.Text text = overlay.new Text();
				List<Attribute> attributes = ele.attributes();
				for(Attribute att:attributes){
					if(att.getName().equalsIgnoreCase("cssClass") && !att.getValue().isEmpty()){
						text.setCssClass(att.getValue());
					}
					if(att.getName().equalsIgnoreCase("message") && !att.getValue().isEmpty()){
						text.setMessage(att.getValue());
					}
					if(att.getName().equalsIgnoreCase("imageUrl") && !att.getValue().isEmpty()){
						text.setImageUrl(att.getValue());
					}
				}
				overlay.addCaption(text);
				//overlay.setCaptions(captions)
				////logger.debug(ele.getName());
			}
		}
		return overlay;
	
	}
	
	*/
	/*
	private BannerDpo.Slide parseOverlays(List<Element> elements,BannerDpo.Slide slide){
		for(Element elem:elements){
			List<Element> elems = elem.elements(OVERLAY);
			for(Element ele:elems){
				BannerDpo.Slide.Overlay overlay = slide.new Overlay();
				List<Attribute> attributes = ele.attributes();
				for(Attribute att:attributes){
					if(att.getName().equalsIgnoreCase("cssClass") && !att.getValue().isEmpty()){
						overlay.setCssClass(att.getValue());
					}
					if(att.getName().equalsIgnoreCase("dataX") && !att.getValue().isEmpty()){
						overlay.setDataX(Integer.parseInt(att.getValue()));
					}
					if(att.getName().equalsIgnoreCase("dataY") && !att.getValue().isEmpty()){
						overlay.setDataY(Integer.parseInt(att.getValue()));
					}
					if(att.getName().equalsIgnoreCase("dataCaptionHidden") && !att.getValue().isEmpty()){
						overlay.setDataCaptionHidden(att.getValue());
					}
					if(att.getName().equalsIgnoreCase("dataEasing") && !att.getValue().isEmpty()){
						overlay.setDataEasing(att.getValue());
					}
					if(att.getName().equalsIgnoreCase("dataStart") && !att.getValue().isEmpty()){
						overlay.setDataStart(Integer.parseInt(att.getValue()));
					}
					if(att.getName().equalsIgnoreCase("dataEndSpeed") && !att.getValue().isEmpty()){
						overlay.setDataEndSpeed(Integer.parseInt(att.getValue()));
					}
					if(att.getName().equalsIgnoreCase("fontSize") && !att.getValue().isEmpty()){
						overlay.setFontSize(Integer.parseInt(att.getValue()));
					}
					if(att.getName().equalsIgnoreCase("zIndex") && !att.getValue().isEmpty()){
						overlay.setzIndex(Integer.parseInt(att.getValue()));
					}
					if(att.getName().equalsIgnoreCase("imageUrl") && !att.getValue().isEmpty()){
						overlay.setImageUrl(att.getValue());
					}
					
					
					
				}
				List<Element> captions = ele.elements(CAPTIONS);
				overlay= parseCaptions(captions,overlay);
				slide.addOverlay(overlay);
				//overlay.setCaptions(captions)
				////logger.debug(ele.getName());
			}
		}
		return slide;
	
	}
	*/
	/*
	private BannerDpo parseSlides(List<Element> elems, BannerDpo banner) {

		for (Element slideEl : elems) {
				////logger.debug(slideEl.getName());
				BannerDpo.Slide slide = banner.new Slide();
				List<Attribute> attributes = slideEl.attributes();
				for (Attribute att : attributes) {
					if (att.getName().equalsIgnoreCase("backGroundImageUrl") && !att.getValue().isEmpty()) {
						slide.setBackGroundImageUrl(att.getValue());
					}
					if (att.getName().equalsIgnoreCase("dataBgFit") && !att.getValue().isEmpty()) {
						slide.setDataBgFit(att.getValue());
					}
					if (att.getName().equalsIgnoreCase("dataBgPosition") && !att.getValue().isEmpty()) {
						slide.setDataBgPosition(att.getValue());
					}
					if (att.getName().equalsIgnoreCase("dataBgRepeat") 	&& !att.getValue().isEmpty()) {
						slide.setDataBgRepeat(att.getValue());
					}

				}
				List<Element> elements = slideEl.elements(OVERLAYS);
				slide = parseOverlays(elements, slide);
				banner.addSlide(slide);
			

		}
		return banner;
	} */
	
	
	/**
	 * Daily deal section
	 * @param root
	 * @return
	 */
	private String parseDailyDeal(Element root){
		String xml  = root.asXML();
		////logger.debug(xml);
		////logger.debug("-----------------------------------------------------");
		xml=xml.replace("<daily-deal>", "");
		xml=xml.replace("</daily-deal>", "");
		//xml=xml.replaceAll("<img src=\"", "<img src=\""+IMAGES_URL);
		//xml=xml.replaceAll("src=\"", "src=\""+IMAGES_URL);
		xml= xml.replace("<!--", "");
		xml= xml.replace("-->", "");
		return xml;
		
	}
	/**
	 * Weekly deals section
	 * @param root
	 * @return
	 */
	private String parseWeeklyDeal(Element root){
		String xml  = root.asXML();
		////logger.debug(xml);
		////logger.debug("-----------------------------------------------------");
		xml=xml.replace("<weekly-deal>", "");
		xml=xml.replace("</weekly-deal>", "");
		//xml=xml.replaceAll("<img src=\"", "<img src=\""+IMAGES_URL);
		//xml=xml.replaceAll("src=\"", "src="+IMAGES_URL);
		xml= xml.replace("<!--", "");
		xml= xml.replace("-->", "");
		return xml;
		
	}
	
	/**
	 * for parsing top banner
	 * @param root
	 * @return
	 */
	private String parseTopBanner(Element root){

		String xml  = root.asXML();
		////logger.debug(xml);
		////logger.debug("-----------------------------------------------------");
		xml=xml.replace("<top-banner>", "");
		xml=xml.replace("</top-banner>", "");
		//xml=xml.replaceAll("<img src=\"", "<img src=\""+IMAGES_URL);
		//xml=xml.replaceAll("src=\"", "src="+IMAGES_URL);
		xml= xml.replace("<!--", "");
		xml= xml.replace("-->", "");
		/*
		
		List<BannerDpo> banners = new LinkedList<BannerDpo>();
		List<Element> rootElements = root.elements(SLIDES);
		for(Element elem:rootElements){
			////logger.debug(elem.getName());
			BannerDpo banner = new BannerDpo();
			List<Element> slides = elem.elements(SLIDE);
			banner = parseSlides(slides,banner);
			banners.add(banner);
		}
		
		
		
		return banners;
		*/
		return xml;
		
	}
	
	
	/**
	 * This method parses the xml property file & creates a collection of values
	 * @param root
	 */
	private void parse(Element root,boolean override){
		if(properties==null){properties = new HashMap<String,Object>();}
		ArrayList<Element> rootElements = new ArrayList<Element>(root.elements());
		
		for(Element elem:rootElements){
			////logger.debug(""+elem.getName());
			//menus
			
			if(MENUS.toUpperCase().equals(elem.getName().toUpperCase())){
				List<MenuDpo> mnus = parseMenu(elem);
				properties.put(MENUS, mnus);
			}
			
			// banner
			if(TOP_BANNER.toUpperCase().equals(elem.getName().toUpperCase())){
				//List<BannerDpo> banners = parseTopBanner(elem);
				String banners = parseTopBanner(elem);
				properties.put(TOP_BANNER, banners);
			}
			// banner
			if(DAILY_DEAL.toUpperCase().equals(elem.getName().toUpperCase())){
				//List<BannerDpo> banners = parseTopBanner(elem);
				String dailyDeal = parseDailyDeal(elem);
				properties.put(DAILY_DEAL, dailyDeal);
			}
			if(WEEKLY_DEAL.toUpperCase().equals(elem.getName().toUpperCase())){
				//List<BannerDpo> banners = parseTopBanner(elem);
				String weelyDeal = parseWeeklyDeal(elem);
				properties.put(WEEKLY_DEAL, weelyDeal);
			}
			
			
		}
		
		
	}

	
	public static void main(String arg[]){

		XmlPropertiesHandler prop = getInstance();
		List<Integer> types = new ArrayList<Integer>();
		
		types.add(2);
		prop.initialize(types);
		String banner = (String) prop.getProperties().get(TOP_BANNER);
		//logger.debug(banner);
		
		banner = (String) prop.getProperties().get(DAILY_DEAL);
		//logger.debug(banner);

		banner = (String) prop.getProperties().get(WEEKLY_DEAL);
		//logger.debug(banner);

		
		/*
		List<MenuDpo> mnus = (List<MenuDpo>)prop.getProperties().get(MENUS);
		List<BannerDpo> banners = (List<BannerDpo>) prop.getProperties().get(TOP_BANNER);
		List<DealsDpo> deals = (List<DealsDpo>) prop.getProperties().get(DAILY_DEAL);
		*/
		/*
		for(MenuDpo menu: mnus){
			////logger.debug(menu.getDisplayName());
			List<MenuDpo> subMenus = menu.getSubMenu();
			for(MenuDpo submenu: subMenus){
				////logger.debug("-----"+submenu.getDisplayName());
			}
		}*/
		/*
		for(BannerDpo banner: banners){
			//////logger.debug(banner.getDataMasterSpeed());
			CommonUtils.printObject(banner);
			
		}*/
	}

	@Override
	public Object getImplementation(String tagName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getApplicationProperty(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatabaseProperty(String id, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEnvironmentProperty(String id, String key) {
		// TODO Auto-generated method stub
		return null;
	}
}

