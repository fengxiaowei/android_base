package com.study.layout.constraint.constraintlayoutdemo;

/**
 * Created by fengxiaowei on 17/10/30.
 */

public class DataModel {


    public static class DataBean {
        /**
         * backgroundImage :
         * attention : 0
         * fans : 1
         * comment : 0
         * like : 0
         * collect : 0
         * attentionStatus : false
         * unReadBlogNum : 0
         * unReadCollectNum : 0
         * unReadCommentNum : 0
         * unReadFansNum : 1
         * unReadLikedNum : 0
         * shareData : {"title":"匿名的随享","url":"https://pangu.ffan.com/enjoy?hostPuid=","content":"心随我动，乐享人生，随享伴你同行！"}
         * nickName : 匿名
         * gender : 3
         */

        private String backgroundImage;
        private String attention;
        private String fans;
        private String comment;
        private String like;
        private String collect;
        private boolean attentionStatus;
        private int unReadBlogNum;
        private int unReadCollectNum;
        private int unReadCommentNum;
        private int unReadFansNum;
        private int unReadLikedNum;
        private ShareDataBean shareData;
        private String nickName;
        private int gender;

        public String getBackgroundImage() {
            return backgroundImage;
        }

        public void setBackgroundImage(String backgroundImage) {
            this.backgroundImage = backgroundImage;
        }

        public String getAttention() {
            return attention;
        }

        public void setAttention(String attention) {
            this.attention = attention;
        }

        public String getFans() {
            return fans;
        }

        public void setFans(String fans) {
            this.fans = fans;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getLike() {
            return like;
        }

        public void setLike(String like) {
            this.like = like;
        }

        public String getCollect() {
            return collect;
        }

        public void setCollect(String collect) {
            this.collect = collect;
        }

        public boolean isAttentionStatus() {
            return attentionStatus;
        }

        public void setAttentionStatus(boolean attentionStatus) {
            this.attentionStatus = attentionStatus;
        }

        public int getUnReadBlogNum() {
            return unReadBlogNum;
        }

        public void setUnReadBlogNum(int unReadBlogNum) {
            this.unReadBlogNum = unReadBlogNum;
        }

        public int getUnReadCollectNum() {
            return unReadCollectNum;
        }

        public void setUnReadCollectNum(int unReadCollectNum) {
            this.unReadCollectNum = unReadCollectNum;
        }

        public int getUnReadCommentNum() {
            return unReadCommentNum;
        }

        public void setUnReadCommentNum(int unReadCommentNum) {
            this.unReadCommentNum = unReadCommentNum;
        }

        public int getUnReadFansNum() {
            return unReadFansNum;
        }

        public void setUnReadFansNum(int unReadFansNum) {
            this.unReadFansNum = unReadFansNum;
        }

        public int getUnReadLikedNum() {
            return unReadLikedNum;
        }

        public void setUnReadLikedNum(int unReadLikedNum) {
            this.unReadLikedNum = unReadLikedNum;
        }

        public ShareDataBean getShareData() {
            return shareData;
        }

        public void setShareData(ShareDataBean shareData) {
            this.shareData = shareData;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public static class ShareDataBean {
            /**
             * title : 匿名的随享
             * url : https://pangu.ffan.com/enjoy?hostPuid=
             * content : 心随我动，乐享人生，随享伴你同行！
             */

            private String title;
            private String url;
            private String content;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}
