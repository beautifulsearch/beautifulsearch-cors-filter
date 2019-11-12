# BeautifulSearch CORS servlet filter 

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