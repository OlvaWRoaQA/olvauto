<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3</name>
   <tag></tag>
   <elementGuidId>1eb13bfd-0286-4a0e-8d2f-760e353f8fd5</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//input[contains(@id,'frmLiquidacionEnvio:codigoBarras')]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>input</value>
      <webElementGuid>4d50a8e8-964c-46cf-a645-515f7b22f5ac</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>frmAsignacion:txtCodigoBarras</value>
      <webElementGuid>d7636e29-b444-4c44-a04a-dd65172b5ea5</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>name</name>
      <type>Main</type>
      <value>frmAsignacion:txtCodigoBarras</value>
      <webElementGuid>b77b99b2-618d-4f25-ad17-12a2b12a4098</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>type</name>
      <type>Main</type>
      <value>text</value>
      <webElementGuid>2ba71810-3445-4dca-8548-0bd0e88d5c81</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>autocomplete</name>
      <type>Main</type>
      <value>off</value>
      <webElementGuid>f6c63cd1-b026-4916-abb5-5438e6973516</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>size</name>
      <type>Main</type>
      <value>54</value>
      <webElementGuid>e1fc2353-9d8f-4879-8d3c-62ceebfaf734</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>onkeypress</name>
      <type>Main</type>
      <value>if (event.keyCode === 13) {                                                                  if (this.value === '') {                                                                      PF('growlFrmAsignacionMsg').renderMessage({'summary': '', 'detail': 'INGRESE VALOR.', 'severity': 'warn'});                                                                  } else {                                                                      if (!isRemitoAsignado(this.value)) {                                                                          sendCodBarras(this.value, '1');                                                                      } else {                                                                          if(checkAsignarAuto){                                                                             sendCodBarras(this.value, '1');                                                                          }else{                                                                             PF('growlFrmAsignacionMsg').renderMessage({'summary': '', 'detail': 'EL ENVIO YA FUE ASIGNADO.', 'severity': 'warn'});                                                                          }                                                                      }                                                                      $('#frmAsignacion\\:ihnValueCodigoBarras').val(this.value);                                                                      this.value = '';                                                                      console.log('remito oculto: '+$('#frmAsignacion\\:ihnValueCodigoBarras').val());                                                                  }                                                                  return false;                                                              }</value>
      <webElementGuid>f48e6888-2266-4a9b-9946-9d78cbe15843</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all codigoDeBarras ui-state-focus ui-state-hover</value>
      <webElementGuid>dbce9b20-1d41-4ebd-a57c-295cc0f03141</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>textbox</value>
      <webElementGuid>ddc9f46f-b548-49ad-85ce-49616db3e00a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-disabled</name>
      <type>Main</type>
      <value>false</value>
      <webElementGuid>02d58b9b-99dc-410b-abb6-723c404cc4fe</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-readonly</name>
      <type>Main</type>
      <value>false</value>
      <webElementGuid>116da5df-9571-4553-97b5-fb48bc4b2a76</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;frmAsignacion:txtCodigoBarras&quot;)</value>
      <webElementGuid>12dd85ef-a8a1-44d9-baeb-188048105cda</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/Olva Corp/Page_Principal - Olva Courier/iframe_Reporte Destajo por Operador_iframeP_aa3353</value>
      <webElementGuid>a6aca95a-76bf-4d60-8aad-6563c3491874</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/Olva Corp/Distribucion/iframe_Reporte Destajo por Operador_iframeP_aa3353</value>
      <webElementGuid>c80867d8-9058-46eb-9eed-d85ca39b19d3</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//input[@id='frmAsignacion:txtCodigoBarras']</value>
      <webElementGuid>dd894d72-1236-4bf7-86ec-c6d98938d18d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//table[@id='frmAsignacion:j_idt14']/tbody/tr/td/table/tbody/tr[3]/th[2]/input</value>
      <webElementGuid>696b74d8-ac25-490c-a7b2-0d3b96c7f62b</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//tr[3]/th[2]/input</value>
      <webElementGuid>a86416b0-bf8f-45af-b026-49bd089d249c</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//input[@id = 'frmAsignacion:txtCodigoBarras' and @name = 'frmAsignacion:txtCodigoBarras' and @type = 'text']</value>
      <webElementGuid>350608ce-df52-4ab6-8ebf-41c2778e7b25</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
