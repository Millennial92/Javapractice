package Practice.SOLIDprinciples.LSP;

public class Instagram extends SocialMedia {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendPhotoAndVideos() {

    }

    @Override
    public void groupVideoCall(String users) {


     // 3. Not a service provided by Instagram, hence it violates LSP.

    }
}
