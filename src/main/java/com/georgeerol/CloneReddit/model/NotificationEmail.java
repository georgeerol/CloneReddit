package com.georgeerol.CloneReddit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by George Fouche on 8/25/20.
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEmail {
    private String subject;
    private String recipient;
    private String body;

}
