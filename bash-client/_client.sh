#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING 
# ! swagger-codegen (https://github.com/swagger-api/swagger-codegen) 
# ! FROM SWAGGER SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl 
# !
# ! Generated on: 2017-02-16T18:26:15.560Z
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[print manual]' \
  '*'{-K,--config}'[use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[limit total time of operation]:seconds' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '-q[do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the 'Accept' header in the request]' \
  {-ct,--content-type}'[Set the 'Content-type' header in request]' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "agastsCodeGet[]" \
            "createAgast[Create agast]" \
            "deleteAgast[]" \
            "getAgastList[]" \
            "updateAgast[Update agast]"             "accountsAccountIdCompaniesGet[Retrieve Companies by account]" \
            "createAccountCompany[Create company and your data configuration]"             "getZipCode[]"             "authPost[authorization]"             "companiesGet[Retrieve Companies by account]" \
            "createCompany[Create company and your data configuration]" \
            "deleteAccountCompany[]" \
            "deleteCompany[]" \
            "infoCompany[Get company information and your data configuration]" \
            "updateCompany[Update company information and your data configuration]"             "companiesCompanyIdAgastsCodeGet[]" \
            "companiesCompanyIdAgastsGet[]" \
            "createCustomAgast[Create custom agast for one company]" \
            "deleteAgast[]" \
            "updateCustomAgast[Update custom agast for one company]"             "companiesCompanyIdNfseCertificateDelete[]" \
            "companiesCompanyIdNfseCertificateGet[]" \
            "companiesCompanyIdNfseCertificatePost[]" \
            "companiesCompanyIdNfseCertificatePut[]"             "companiesCompanyIdIcmsGet[]" \
            "companiesCompanyIdIcmsStateGet[]" \
            "createICMS[Create custom ICMS tax for one company]" \
            "deleteCustomIcmsConfByState[]" \
            "updateCustomIcmsConfByState[Update custom agast for one company]"             "companiesCompanyIdItemsCodeCpomCityCodeGet[]" \
            "companiesCompanyIdItemsCodeCpomGet[]" \
            "createItemCPOM[Create custom agast for one company]" \
            "deleteItemCPOM[]" \
            "updateItemCPOM[Update custom agast for one company]"             "companiesCompanyIdItemsCodeChangeCodePut[]" \
            "companiesCompanyIdItemsCodegoodsGet[]" \
            "companiesCompanyIdItemsgoodsGet[]" \
            "createItem[Create custom agast for one company]" \
            "deleteItem[]" \
            "updateItem[Update custom agast for one company]"             "companiesCompanyIdItemsCodeChangeCodePut[]" \
            "companiesCompanyIdItemsCodeserviceGet[]" \
            "companiesCompanyIdItemsserviceGet[]" \
            "createItemService[Create custom agast for one company]" \
            "deleteItemService[]" \
            "updateItemService[Update custom agast for one company]"             "companiesCompanyIdLocationsCodeGet[]" \
            "companiesCompanyIdLocationsGet[]" \
            "createLocation[Create new location for company]" \
            "deleteLocation[]" \
            "updateLocation[Update location for company]"             "companiesCompanyIdProcessCodeGet[]" \
            "companiesCompanyIdProcessGet[]" \
            "createCustomProcessScenario[Create custom process tax for one company]" \
            "deleteCustomProcessScenario[]" \
            "updateCustomProcessScenario[Update custom agast for one company]"             "companiesCompanyIdTaxratesGet[]" \
            "companiesCompanyIdTaxratesTaxTypeGet[]" \
            "createCustomTaxes[Create custom agast for one company]" \
            "deleteCustomTaxes[]" \
            "updateCustomTaxes[Update custom agast for one company]"             "calculationsgoodsPurchasePost[Calculation Method]" \
            "calculationsgoodsSalesPost[Calculation Method]"             "transactionsgoodsPurchasePost[Transaction Method]" \
            "transactionsgoodsSalesPost[Transaction Method]"             "invoiceDropContingency[Invoice Drop Contingency per State]" \
            "invoiceSetContingency[Invoice Set Contingency per State]" \
            "invoiceVerifyContingency[Invoice Verify Contingency per State]"             "invoicesNfceKeyGet[NFCe Danfe Print]"             "nfePrint[Retrieve Danfe]"             "invoicesSefazDelete[Disable Range e-Invoice]" \
            "invoicesSefazKeyDelete[Cancel invoice]" \
            "invoicesSefazKeyGet[Retrieve invoice]" \
            "invoicesSefazKeyLookupGet[Retrieve invoice]" \
            "invoicesSefazKeyPut[Fix Letter]" \
            "invoicesSefazPost[Send an e-Invoice]" \
            "invoicesSefazStatusGet[Retrieve Status of SEFAZ Server]"             "invoiceSettings[Invoice Settigns]"             "createReason.[Create Legal Reason.]" \
            "deleteReason.[Delete a Legal Reason entry.]" \
            "getReason.[Get single Legal Reason.]" \
            "listReason[List Legal Reasons.]" \
            "updateReason.[Update Legal Reason.]"             "calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet[Retrieve transactions]" \
            "calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost[Promote a calculation to transaction]" \
            "calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet[Retrieve transactions]" \
            "calculationsservicePaymentPost[Calculation Method]" \
            "calculationsservicePurchasePost[Calculation Method]" \
            "calculationsserviceReceiptPost[Calculation Method]" \
            "calculationsserviceSalesPost[Calculation Method]"             "transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet[Retrieve transactions]" \
            "transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost[Transaction State Transition]" \
            "transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet[Retrieve transactions]" \
            "transactionsservicePaymentPost[Calculation Method]" \
            "transactionsservicePurchasePost[Calculation Method]" \
            "transactionsserviceReceiptPost[Calculation Method]" \
            "transactionsserviceSalesPost[Calculation Method]"             "createCfop[create a new CFOP configuration]" \
            "deleteCfop[disable a CFOP.]" \
            "getCfop[get CFOP information.]" \
            "getCfopList[retrive list of CFOP.]" \
            "updateCfop[update a CFOP configuration]"             "createIbptConf[create a new Process Type configuration]" \
            "deleteIbptConf[disable a IBPT.]" \
            "getIbptConf[get IBPT information.]" \
            "getIbptConfList[retrive list of IBPT.]" \
            "updateIbptConf[update a Process Type configuration]"             "createIcmsconfstate[create a new ICMS Configuration]" \
            "deleteIcmsConf[disable a ICMS by State.]" \
            "getIcmsConfByState[get ICMS information by State.]" \
            "getIcmsList[retrive list of ICMS.]" \
            "getIcmsList_0[retrive list of ICMS.]" \
            "updateIcmsconfstate[update a IcmsConf State,]"             "createIssConfByCity[create a new ISS Configuration]" \
            "deleteIssConf[disable a ISS by City Code.]" \
            "getIssConfByCity[get ISS information by City Code.]" \
            "getIssList[retrive list of ISS]" \
            "updateIssConfByCity[update a ISS by City Code.]"             "createProcess[create a new Process Type configuration]" \
            "deleteProcess[disable a Process.]" \
            "getProcess[get Process information.]" \
            "getProcessList[retrive list of Process.]" \
            "updateProcess[update a Process Type configuration]" 
    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      agastsCodeGet)
        local -a _op_arguments
        _op_arguments=(
          "code=:Agast Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createAgast)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteAgast)
        local -a _op_arguments
        _op_arguments=(
          "code=:Agast Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getAgastList)
        local -a _op_arguments
        _op_arguments=(
                    "text=:Text query"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateAgast)
        local -a _op_arguments
        _op_arguments=(
          "code=:Agast Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      accountsAccountIdCompaniesGet)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createAccountCompany)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getZipCode)
        local -a _op_arguments
        _op_arguments=(
          "zipcode=:ZIP Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      authPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Authorization: Basic VGVzdDoxMjM=
"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesGet)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createCompany)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteAccountCompany)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
"companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteCompany)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      infoCompany)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateCompany)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdAgastsCodeGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Agast Code"
          "parent=:Agast parent code, means that this agast is a specialization of parent agast
"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdAgastsGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
          "text=:Text query"
"agast=:Custom Agast Code"
"parent=:Agast Code"
          "X-Pagination-Limit\::The per page limit. Currently set to 10 but subject to change at any time (max 100)."
"X-Pagination-Current-Page\::The current page. Defaults to 1."
"X-Pagination-Sort\::"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createCustomAgast)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
          "text=:Text query"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteAgast)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Agast Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateCustomAgast)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Agast Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdNfseCertificateDelete)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdNfseCertificateGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"companyId=:Company ID"
          "peek=:Use this parameter to check the existence of the file without downloading it."
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdNfseCertificatePost)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdNfseCertificatePut)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdIcmsGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    "X-Pagination-Limit\::The per page limit. Currently set to 10 but subject to change at any time (max 100)."
"X-Pagination-Current-Page\::The current page. Defaults to 1."
"X-Pagination-Sort\::"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdIcmsStateGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"state=:Brazilian State"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createICMS)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteCustomIcmsConfByState)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"state=:Brazilian State"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateCustomIcmsConfByState)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"state=:Brazilian State"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdItemsCodeCpomCityCodeGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
"cityCode=:City Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdItemsCodeCpomGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
                    "X-Pagination-Limit\::The per page limit. Currently set to 10 but subject to change at any time (max 100)."
"X-Pagination-Current-Page\::The current page. Defaults to 1."
"X-Pagination-Sort\::"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createItemCPOM)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteItemCPOM)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
"cityCode=:City Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateItemCPOM)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
"cityCode=:City Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdItemsCodeChangeCodePut)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
          "goods=:Provide to apply to goods items."
"service=:Provide to apply to service items."
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdItemsCodegoodsGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
          "agast=:Custom Agast Code"
          "Avalara-Product-Type\::Avalara Product Type"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdItemsgoodsGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
          "code=:Item Code"
"agast=:Custom Agast Code"
          "Avalara-Product-Type\::Avalara Product Type"
"X-Pagination-Limit\::The per page limit. Currently set to 10 but subject to change at any time (max 100)."
"X-Pagination-Current-Page\::The current page. Defaults to 1."
"X-Pagination-Sort\::"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createItem)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    "Avalara-Product-Type\::Avalara Product Type"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteItem)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
                    "Avalara-Product-Type\::Avalara Product Type"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateItem)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
                    "Avalara-Product-Type\::Avalara Product Type"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdItemsCodeChangeCodePut)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
          "goods=:Provide to apply to goods items."
"service=:Provide to apply to service items."
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdItemsCodeserviceGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
          "agast=:Custom Agast Code"
          "Avalara-Product-Type\::Avalara Product Type"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdItemsserviceGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
          "code=:Item Code"
"agast=:Custom Agast Code"
          "Avalara-Product-Type\::Avalara Product Type"
"X-Pagination-Limit\::The per page limit. Currently set to 10 but subject to change at any time (max 100)."
"X-Pagination-Current-Page\::The current page. Defaults to 1."
"X-Pagination-Sort\::"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createItemService)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    "Avalara-Product-Type\::Avalara Product Type"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteItemService)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
                    "Avalara-Product-Type\::Avalara Product Type"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateItemService)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Item Code"
                    "Avalara-Product-Type\::Avalara Product Type"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdLocationsCodeGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Location Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdLocationsGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    "X-Pagination-Limit\::The per page limit. Currently set to 10 but subject to change at any time (max 100)."
"X-Pagination-Current-Page\::The current page. Defaults to 1."
"X-Pagination-Sort\::"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createLocation)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteLocation)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Location Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateLocation)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Location Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdProcessCodeGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Process Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdProcessGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    "X-Pagination-Limit\::The per page limit. Currently set to 10 but subject to change at any time (max 100)."
"X-Pagination-Current-Page\::The current page. Defaults to 1."
"X-Pagination-Sort\::"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createCustomProcessScenario)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteCustomProcessScenario)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Process Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateCustomProcessScenario)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"code=:Process Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdTaxratesGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    "X-Pagination-Limit\::The per page limit. Currently set to 10 but subject to change at any time (max 100)."
"X-Pagination-Current-Page\::The current page. Defaults to 1."
"X-Pagination-Sort\::"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      companiesCompanyIdTaxratesTaxTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"taxType=:Tax Type"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createCustomTaxes)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteCustomTaxes)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"taxType=:Tax Type"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateCustomTaxes)
        local -a _op_arguments
        _op_arguments=(
          "companyId=:Company ID"
"taxType=:Tax Type"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsgoodsPurchasePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsgoodsSalesPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsgoodsPurchasePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsgoodsSalesPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoiceDropContingency)
        local -a _op_arguments
        _op_arguments=(
          "state=:Brazilian State"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoiceSetContingency)
        local -a _op_arguments
        _op_arguments=(
          "state=:Brazilian State"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoiceVerifyContingency)
        local -a _op_arguments
        _op_arguments=(
          "state=:Brazilian State"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoicesNfceKeyGet)
        local -a _op_arguments
        _op_arguments=(
          "key=:Invoice Key"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      nfePrint)
        local -a _op_arguments
        _op_arguments=(
          "key=:Invoice Key"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoicesSefazDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoicesSefazKeyDelete)
        local -a _op_arguments
        _op_arguments=(
          "key=:Invoice Key"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoicesSefazKeyGet)
        local -a _op_arguments
        _op_arguments=(
          "key=:Invoice Key"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoicesSefazKeyLookupGet)
        local -a _op_arguments
        _op_arguments=(
          "key=:Invoice Key"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoicesSefazKeyPut)
        local -a _op_arguments
        _op_arguments=(
          "key=:Invoice Key"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoicesSefazPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoicesSefazStatusGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      invoiceSettings)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createReason.)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteReason.)
        local -a _op_arguments
        _op_arguments=(
          "uuid=:"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getReason.)
        local -a _op_arguments
        _op_arguments=(
          "uuid=:"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      listReason)
        local -a _op_arguments
        _op_arguments=(
                    "companyId=:Filters by company domain entries.
Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries.
CompanyId searches also match global entries.
"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateReason.)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
"companyCode=:Company Code"
"transactionType=:Transaction Type (sale, purchase, receipts or payment)"
"documentCode=:Document Code"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
"companyCode=:Company Code"
"transactionType=:Transaction Type (sale, purchase, receipts or payment)"
"documentCode=:Document Code"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
"companyCode=:Company Code"
"transactionType=:Transaction Type (sale, purchase, receipts or payment)"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsservicePaymentPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsservicePurchasePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsserviceReceiptPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      calculationsserviceSalesPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
"companyCode=:Company Code"
"transactionType=:Transaction Type (sale, purchase, receipts or payment)"
"documentCode=:Document Code"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
"companyCode=:Company Code"
"transactionType=:Transaction Type (sale, purchase, receipts or payment)"
"documentCode=:Document Code"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "accountId=:Account ID"
"companyCode=:Company Code"
"transactionType=:Transaction Type (sale, purchase, receipts or payment)"
                    "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsservicePaymentPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsservicePurchasePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsserviceReceiptPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      transactionsserviceSalesPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::Bearer {auth}"
)
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createCfop)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteCfop)
        local -a _op_arguments
        _op_arguments=(
          "code=:CFOP Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getCfop)
        local -a _op_arguments
        _op_arguments=(
          "code=:CFOP Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getCfopList)
        local -a _op_arguments
        _op_arguments=(
                    "suffixcode=:Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type
"
"date=:When informed return valid version configuration for this date
"
"inactive=true:return the inactive versions too
"
          "inactive=false:return the inactive versions too
"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateCfop)
        local -a _op_arguments
        _op_arguments=(
          "code=:CFOP Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createIbptConf)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteIbptConf)
        local -a _op_arguments
        _op_arguments=(
          "code=:IBPT Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getIbptConf)
        local -a _op_arguments
        _op_arguments=(
          "code=:IBPT Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getIbptConfList)
        local -a _op_arguments
        _op_arguments=(
                    "accountId=:filter the configuration by accountID, if not informed, only the standard configuration will be returned
"
"date=:When informed return valid version configuration for this date
"
"inactive=true:return the inactive versions too
"
          "inactive=false:return the inactive versions too
"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateIbptConf)
        local -a _op_arguments
        _op_arguments=(
          "code=:IBPT Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createIcmsconfstate)
        local -a _op_arguments
        _op_arguments=(
          "state=:Brazilian State"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteIcmsConf)
        local -a _op_arguments
        _op_arguments=(
          "state=:Brazilian State"
"code=:ICMS Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getIcmsConfByState)
        local -a _op_arguments
        _op_arguments=(
          "state=:Brazilian State"
"code=:ICMS Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getIcmsList)
        local -a _op_arguments
        _op_arguments=(
          "state=:Brazilian State"
          "suffixcode=:Identify this ICMS"
"date=:When informed return valid version configuration for this date"
"inactive=true:return the inactive versions too"
          "inactive=false:return the inactive versions too"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getIcmsList_0)
        local -a _op_arguments
        _op_arguments=(
                    "text=:Search for codes"
"state=:Filter for states"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateIcmsconfstate)
        local -a _op_arguments
        _op_arguments=(
          "state=:Brazilian State"
"code=:ICMS Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createIssConfByCity)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteIssConf)
        local -a _op_arguments
        _op_arguments=(
          "cityCode=:City Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getIssConfByCity)
        local -a _op_arguments
        _op_arguments=(
          "cityCode=:City Code"
          "code=:Identificator of this configuration, it is unique for account or standard namedspace
"
"date=:When informed return valid version configuration for this date
"
"inactive=true:return the inctives versions too
"
          "inactive=false:return the inctives versions too
"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getIssList)
        local -a _op_arguments
        _op_arguments=(
                    "suffixcode=:Identify this ISS
"
"date=:When informed return valid version configuration for this date
"
"inactive=true:return the inactive versions too
"
          "inactive=false:return the inactive versions too
"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateIssConfByCity)
        local -a _op_arguments
        _op_arguments=(
          "cityCode=:City Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      createProcess)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      deleteProcess)
        local -a _op_arguments
        _op_arguments=(
          "code=:Process Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getProcess)
        local -a _op_arguments
        _op_arguments=(
          "code=:Process Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      getProcessList)
        local -a _op_arguments
        _op_arguments=(
                    "accountId=:filter the configuration by accountID, if not informed, only the standard configuration will be returned
"
"date=:When informed return valid version configuration for this date
"
"inactive=true:return the inactive versions too
"
          "inactive=false:return the inactive versions too
"
          )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
      updateProcess)
        local -a _op_arguments
        _op_arguments=(
          "code=:Process Code"
                    )
        _describe -t actions 'operations' _op_arguments && ret=0
        ;;
    esac
    ;;

esac

return ret