package com.jensen;

import java.util.ArrayList;
import java.util.Date;


public class MockData {

    private ArrayList<BlogPost> blogPosts;

    public MockData() {
        blogPosts = new ArrayList<>();
        blogPosts.add(new BlogPost("Analysun infinitum", "Leonhard Euler", new Date(1000), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec congue mauris sed laoreet viverra. Curabitur a ante non tellus mattis ornare. Pellentesque augue turpis, viverra sed egestas ac, malesuada suscipit lorem. Morbi vel odio porta, semper elit vel, finibus arcu. Vivamus vestibulum sem mauris, in molestie lorem congue ac. Quisque congue mauris id leo cursus, ut viverra nisi sagittis. Suspendisse at mattis nulla. Donec pharetra lorem tempor, vestibulum leo eu, lobortis neque. Praesent viverra nisl efficitur augue vestibulum ullamcorper."));
        blogPosts.add(new BlogPost("Fourier Analysis", "Jean-Baptiste Joseph Fourier", new Date(10000), "Maecenas auctor imperdiet enim ut feugiat. Cras vel finibus arcu, in hendrerit neque. Duis a purus et sapien vestibulum semper at vel neque. Nunc imperdiet pharetra ex eu euismod. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras semper quam efficitur mauris malesuada rhoncus. Pellentesque vulputate massa non neque tincidunt fermentum. Nam urna turpis, feugiat nec dictum vitae, hendrerit vehicula est. Sed justo eros, cursus nec nulla vitae, mattis ultricies lectus. Sed hendrerit nulla luctus, vestibulum lorem non, feugiat mauris."));
        blogPosts.add(new BlogPost("Complex Analysis", "Louis-Augustine Cauchy", new Date(40*24*3600*365), "In hac habitasse platea dictumst. Fusce nec dignissim arcu. Aliquam rutrum fringilla nisi, vel feugiat justo euismod vel. Cras dapibus nisl a tempor pellentesque. Maecenas convallis nibh ac rhoncus mollis. Nullam metus nulla, tempor vel justo in, porta eleifend mauris. Donec id mauris sed enim venenatis commodo. Sed sit amet efficitur diam, a euismod ex. Donec dolor tortor, porta vehicula lectus eu, elementum varius nibh. Aenean mollis malesuada metus, vel blandit arcu malesuada vitae. Phasellus aliquet ligula non sodales semper. Praesent aliquam arcu tellus, at vehicula metus lacinia eget."));
    }

    public BlogPost getBlogPost(int id) {
        return blogPosts.get(id);
    }

    public int getNumberOfPosts() {
        return blogPosts.size();
    }
}