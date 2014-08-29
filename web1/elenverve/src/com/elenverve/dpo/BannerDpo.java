package com.elenverve.dpo;

import java.util.LinkedList;
import java.util.List;

public class BannerDpo {

	/**
	 * These are constants related to Banner
	 */

	// data transitions
	public static String BOXSLIDE = "boxslide";
	public static String BOXFADE = "boxfade";
	public static String SLOTZOOM_HORIZONTAL = "slotzoom-horizontal";
	public static String SLOTSLIDE_HORIZONTAL = "slotslide-horizontal";
	public static String SLOTFADE_HORIZONTAL = "slotfade-horizontal";
	public static String SLOTZOOM_VERTICAL = "slotzoom-vertical";
	public static String SLOTSLIDE_VERTICAL = "slotslide-vertical";
	public static String SLOTFADE_VERTICAL = "slotfade-vertical";
	public static String CURTAIN_1 = "curtain-1";
	public static String CURTAIN_2 = "curtain-2";
	public static String CURTAIN_3 = "curtain-3";
	public static String SLIDELEFT = "slideleft";
	public static String SLIDERIGHT = "slideright";
	public static String SLIDEUP = "slideup";
	public static String SLIDEDOWN = "slidedown";
	public static String FADE = "fade";
	public static String RANDOM = "random";
	public static String SLIDEHORIZONTAL = "slidehorizontal";
	public static String SLIDEVERTICAL = "slidevertical";
	public static String PAPERCUT = "papercut";
	public static String FLYIN = "flyin";
	public static String TURNOFF = "turnoff";
	public static String CUBE = "cube";
	public static String CURTAIN_VERTICAL_3D = "3dcurtain-vertical";
	public static String CURTAIN_HORIZONTAL_3D = "3dcurtain-horizontal";

	// screen positions
	public static String LEFT_TOP = "left top";
	public static String LEFT_CENTER = "left center";
	public static String LEFT_BOTTOM = "left bottom";

	public static String CENTER_TOP = "center top";
	public static String CENTER_CENTER = "center center";
	public static String CENTER_BOTTOM = "center bottom";

	public static String RIGHT_TOP = "right top";
	public static String RIGHT_CENTER = "right center";
	public static String RIGHT_BOTTOM = "right bottom";

	public static String TP_CAPTION_LFL = "tp-caption_lfl";
	public static String TP_CAPTION_LFR = "tp-caption_lfr";
	public static String TP_CAPTION_LFB = "tp-caption_lfb";
	public static String TP_CAPTION_LFT = "tp-caption_lft";
	public static String TP_CAPTION_SKEWFROMRIGHT = "tp-caption_skewfromright";
	public static String TP_CAPTION_SKEWFROMLEFT = "tp-caption_skewfromleft";
	public static String TP_CAPTION_FADE = "tp-caption_fade";
	public static String TP_CAPTION_SFR = "tp-caption_sfr";

	private String dataTransition = CURTAIN_VERTICAL_3D;
	private int dataSlotAmount = 7;
	private int dataMasterSpeed = 500;
	private List<Slide> slides = new LinkedList<Slide>();

	public String getDataTransition() {
		return dataTransition;
	}

	public void setDataTransition(String dataTransition) {
		this.dataTransition = dataTransition;
	}

	public int getDataSlotAmount() {
		return dataSlotAmount;
	}

	public void setDataSlotAmount(int dataSlotAmount) {
		this.dataSlotAmount = dataSlotAmount;
	}

	public int getDataMasterSpeed() {
		return dataMasterSpeed;
	}

	public void setDataMasterSpeed(int dataMasterSpeed) {
		this.dataMasterSpeed = dataMasterSpeed;
	}

	public List<Slide> getSlides() {
		return slides;
	}

	public void addSlide(Slide slide) {
		this.slides.add(slide);
	}

	public class Slide {

		private String backGroundImageUrl;
		private String dataBgFit = "cover";
		private String dataBgPosition = LEFT_TOP;
		private String dataBgRepeat = "no-repeat";
		private List<Overlay> overlays = new LinkedList<Overlay>();

		public String getBackGroundImageUrl() {
			return backGroundImageUrl;
		}

		public void setBackGroundImageUrl(String backGroundImageUrl) {
			this.backGroundImageUrl = backGroundImageUrl;
		}

		public String getDataBgFit() {
			return dataBgFit;
		}

		public void setDataBgFit(String dataBgFit) {
			this.dataBgFit = dataBgFit;
		}

		public String getDataBgPosition() {
			return dataBgPosition;
		}

		public void setDataBgPosition(String dataBgPosition) {
			this.dataBgPosition = dataBgPosition;
		}

		public String getDataBgRepeat() {
			return dataBgRepeat;
		}

		public void setDataBgRepeat(String dataBgRepeat) {
			this.dataBgRepeat = dataBgRepeat;
		}

		public List<Overlay> getOverlays() {
			return overlays;
		}

		public void addOverlay(Overlay overlay) {
			this.overlays.add(overlay);
		}

		public class Overlay {
			private String cssClass;
			private int dataX = -20;
			private int dataY = 12;
			private int dataSpeed = 2000;
			private int dataStart = 800;
			private String dataEasing = "Back.easeOut";
			private int dataEndSpeed = 500;
			private String dataCaptionHidden = "on";
			private int fontSize = 40;
			private int zIndex = 4;
			private String imageUrl;
			private List<Text> captions = new LinkedList<Text>();

			public List<Text> getCaptions() {
				return captions;
			}

			public void addCaption(Text caption) {
				this.captions.add(caption);
			}

			public String getCssClass() {
				return cssClass;
			}

			public void setCssClass(String cssClass) {
				this.cssClass = cssClass;
			}

			public int getDataX() {
				return dataX;
			}

			public void setDataX(int dataX) {
				this.dataX = dataX;
			}

			public int getDataY() {
				return dataY;
			}

			public void setDataY(int dataY) {
				this.dataY = dataY;
			}

			public int getDataSpeed() {
				return dataSpeed;
			}

			public void setDataSpeed(int dataSpeed) {
				this.dataSpeed = dataSpeed;
			}

			public int getDataStart() {
				return dataStart;
			}

			public void setDataStart(int dataStart) {
				this.dataStart = dataStart;
			}

			public String getDataEasing() {
				return dataEasing;
			}

			public void setDataEasing(String dataEasing) {
				this.dataEasing = dataEasing;
			}

			public int getDataEndSpeed() {
				return dataEndSpeed;
			}

			public void setDataEndSpeed(int dataEndSpeed) {
				this.dataEndSpeed = dataEndSpeed;
			}

			public String getDataCaptionHidden() {
				return dataCaptionHidden;
			}

			public void setDataCaptionHidden(String dataCaptionHidden) {
				this.dataCaptionHidden = dataCaptionHidden;
			}

			public int getFontSize() {
				return fontSize;
			}

			public void setFontSize(int fontSize) {
				this.fontSize = fontSize;
			}

			public int getzIndex() {
				return zIndex;
			}

			public void setzIndex(int zIndex) {
				this.zIndex = zIndex;
			}

			public String getImageUrl() {
				return imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public class Text {
				private String cssClass;
				private String message;
				private String imageUrl;

				public String getCssClass() {
					return cssClass;
				}

				public void setCssClass(String cssClass) {
					this.cssClass = cssClass;
				}

				public String getMessage() {
					return message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public String getImageUrl() {
					return imageUrl;
				}

				public void setImageUrl(String imageUrl) {
					this.imageUrl = imageUrl;
				}

			}
		}
	}

}
