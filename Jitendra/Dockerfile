FROM openjdk

RUN echo 'export MAC_ADDRESS_IO_API_KEY="at_5V3HU7anDCjRgfXcB6lyKkyuabuGB"' >> ~/.bash_profile



#RUN java MACAddressSample 44:38:39:ff:ef:57
ADD https://github.com/jitgswm/restapi/blob/master/MACAddressSample.java .
RUN javac MACAddressSample.java
RUN java MACAddressSample 44:38:39:ff:ef:57