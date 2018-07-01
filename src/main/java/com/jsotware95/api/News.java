/*
 * Copyright (c) 2018 Youcef DEBBAH (youcef-debbah@hotmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the Software) to deal in the Software without restriction
 * but under the following conditions:
 *
 * - This notice shall be included in all copies and portions of the Software.
 * - The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND (Implicit or Explicit).
 *
 */

package com.jsotware95.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("news")
public class News {

    public static final String SAMPLE_ATOM_FEED =
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<feed xmlns=\"http://www.w3.org/2005/Atom\">\n" +
            "\n" +
            "  <title>Example Feed</title>\n" +
            "  <link href=\"http://example.org/\"/>\n" +
            "  <updated>2003-12-13T18:30:02Z</updated>\n" +
            "  <author>\n" +
            "    <name>John Doe</name>\n" +
            "  </author>\n" +
            "  <id>urn:uuid:60a76c80-d399-11d9-b93C-0003939e0af6</id>\n" +
            "\n" +
            "  <entry>\n" +
            "    <title>Atom-Powered Robots Run Amok</title>\n" +
            "    <link href=\"http://example.org/2003/12/13/atom03\"/>\n" +
            "    <id>urn:uuid:1225c695-cfb8-4ebb-aaaa-80da344efa6a</id>\n" +
            "    <updated>2003-12-13T18:30:02Z</updated>\n" +
            "    <summary>Some text.</summary>\n" +
            "  </entry>\n" +
            "\n" +
            "</feed>";

    @GET
    @Produces(MediaType.APPLICATION_ATOM_XML)
    public String getRSS() {
        return SAMPLE_ATOM_FEED;
    }

}
