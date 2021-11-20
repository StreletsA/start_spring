package com.StreletsA.infs;

import java.util.Date;

public interface IMessage {

    String getContent();
    ISender getSender();
    long getDate();

}
