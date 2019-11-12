# BeautifulSearch CORS servlet filter 

Copy the jar to your webapp WEB-INF/lib folder.

Add to web.xml like so:

```xml
<filter>
  <filter-name>CORS</filter-name>
  <filter-class>org.beautifulsearch.servlet.CORSFilter</filter-class>
</filter>

<filter-mapping>
 <filter-name>CORS</filter-name>
 <url-pattern>/*</url-pattern>
</filter-mapping>
```

For HTTP OPTIONS requests, it always returns a 200 response. 

If installing to Solr, copy the jar to server/solr-webapp/webapp/WEB-INF/lib. 

In server/solr-webapp/webapp/WEB-INF/web.xml, this should be the first servlet filter. Paste to the top of web.xml, right after the opening web-app XML tag.