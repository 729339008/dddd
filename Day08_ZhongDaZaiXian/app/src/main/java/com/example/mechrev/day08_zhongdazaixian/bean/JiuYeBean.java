package com.example.mechrev.day08_zhongdazaixian.bean;

import java.util.List;

/**
 * Created by MECHREV on 2017/11/27.
 */

public class JiuYeBean {


    /**
     * state : true
     * more : false
     * time : 1493041834
     * data : [{"contentid":10100,"modelid":1,"title":"大学生毕业季来临 政策发力护航就业创业","thumb":"http://upload.univs.cn/2017/0424/1493040123828.jpg","description":"支持地方通过财政出资引导社会资本投入，设立高校毕业生就业创业基金。鼓励地方对符合条件的高校毕业生、就业困难人员创业给予一次性补贴。","comments":0,"sorttime":1493041399},{"contentid":10095,"modelid":1,"title":"打通就业创业创新全渠道，实现人才价值最大化","thumb":"http://upload.univs.cn/2017/0424/thumb_640_314_1493022268406.jpg","description":"4月21日上午，李克强总理来到山东大学就业、创业、创新成果展。热情的师生欢呼着把总理层层\u201c包围\u201d，争相介绍创业创新项目，展区现场被挤得水泄不通。","comments":0,"sorttime":1493019174},{"contentid":10041,"modelid":1,"title":"国家@你 这7项职场补贴你可能还没领\u2026\u2026","thumb":"http://upload.univs.cn/2017/0417/thumb_640_314_1492433907753.png","description":"在近日举行的国务院常务会议上，就业创业再度成为焦点。会议指出，鼓励地方对符合条件的高校毕业生、就业困难人员创业给予一次性补贴。","comments":0,"sorttime":1492433890}]
     */

    private boolean state;
    private boolean more;
    private int time;
    private List<DataBean> data;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * contentid : 10100
         * modelid : 1
         * title : 大学生毕业季来临 政策发力护航就业创业
         * thumb : http://upload.univs.cn/2017/0424/1493040123828.jpg
         * description : 支持地方通过财政出资引导社会资本投入，设立高校毕业生就业创业基金。鼓励地方对符合条件的高校毕业生、就业困难人员创业给予一次性补贴。
         * comments : 0
         * sorttime : 1493041399
         */

        private int contentid;
        private int modelid;
        private String title;
        private String thumb;
        private String description;
        private int comments;
        private int sorttime;

        public int getContentid() {
            return contentid;
        }

        public void setContentid(int contentid) {
            this.contentid = contentid;
        }

        public int getModelid() {
            return modelid;
        }

        public void setModelid(int modelid) {
            this.modelid = modelid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public int getSorttime() {
            return sorttime;
        }

        public void setSorttime(int sorttime) {
            this.sorttime = sorttime;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "contentid=" + contentid +
                    ", modelid=" + modelid +
                    ", title='" + title + '\'' +
                    ", thumb='" + thumb + '\'' +
                    ", description='" + description + '\'' +
                    ", comments=" + comments +
                    ", sorttime=" + sorttime +
                    '}';
        }
    }
}
