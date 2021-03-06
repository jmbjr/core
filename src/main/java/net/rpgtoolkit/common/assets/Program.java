/**
 * Copyright (c) 2015, rpgtoolkit.net <help@rpgtoolkit.net>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of
 * the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.rpgtoolkit.common.assets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program extends BasicType {

  private String fileName;
  private StringBuffer programBuffer;

  public Program(String fileName) {
    try {
      file = new File(fileName);
      FileReader fr = new FileReader(file);
      programBuffer = new StringBuffer();

      char[] chr = new char[(int) file.length()];
      fr.read(chr);
      programBuffer.append(chr);
    } catch (FileNotFoundException e1) {
      e1.printStackTrace();
    } catch (IOException e1) {
      e1.printStackTrace();
    }
  }

  public String getFileName() {
    return fileName;
  }

  public StringBuffer getProgramBuffer() {
    return programBuffer;
  }
}
