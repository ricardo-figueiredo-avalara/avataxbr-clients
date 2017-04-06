# AvaTaxBrazil.StateTransition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | - &#39;voided&#39; # Send this event to a Recorded tax transaction record to mark it as voided. - &#39;unvoided&#39; # Send this event to a Voided tax transaction record to mark it as recorded. - &#39;reconciled&#39; # Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. - &#39;unreconciled&#39; # Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state. - &#39;filed&#39; # Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. - &#39;unfiled&#39; # Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system. - &#39;filedByAvalara&#39; # This event can only be sent by Avalara Systems.  | 
**comment** | **String** |  | [optional] 


<a name="TypeEnum"></a>
## Enum: TypeEnum


* `voided` (value: `"voided"`)

* `unvoided` (value: `"unvoided"`)

* `reconciled` (value: `"reconciled"`)

* `unreconciled` (value: `"unreconciled"`)

* `filed` (value: `"filed"`)

* `unfiled` (value: `"unfiled"`)

* `filedByAvalara` (value: `"filedByAvalara"`)




