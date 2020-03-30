using System.Collections;
using System.Collections.Generic;
using UnityEngine;

//https://docs.unity3d.com/ScriptReference/BoxCollider2D.html
public class BoxCollider2DTest : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
		//Required for both Collision and Trigger Detection
        Rigidbody2D gameObjectsRigidBody2D = gameObject.AddComponent<Rigidbody2D>(); // Add the rigidbody.
		gameObjectsRigidBody2D.mass=0;
		gameObjectsRigidBody2D.isKinematic = true;

        BoxCollider2D boxcollider2d = gameObject.AddComponent<BoxCollider2D>(); // Add the rigidbody.
		boxcollider2d.isTrigger=false;
    }

    // Update is called once per frame
    void Update()
    {
		//ManualCheck();
    }
	
	void ManualCheck()
	{
		////Manual Checking/////////////////////////////////////////////////
		BoxCollider2D boxCollider = GetComponent<BoxCollider2D>();
		Collider2D[] hits = Physics2D.OverlapBoxAll(transform.position, boxCollider.size, 0);

        foreach (Collider2D hit in hits)
        {
            // Ignore our own collider.
            //if (hit == boxCollider)continue;
			Debug.Log(hit.gameObject.name);
        }
	}
	
	////In-built methods//////////////////////////////////////////////////////////////////////////
	//Colliders: Exerts force
	//https://answers.unity.com/questions/597269/how-to-use-oncollisionenter.html
	//When a rigid body is detected
	void OnCollisionEnter2D(Collision2D collision)
    {
        Debug.Log("OnCollisionEnter2D: "+collision.gameObject.name);
    }
	void OnCollisionStay2D(Collision2D collision)
    {
        Debug.Log("OnCollisionStay2D: "+collision.gameObject.name);
    }
	void OnCollisionExit2D(Collision2D collision)
    {
        Debug.Log("OnCollisionExit2D: "+collision.gameObject.name);
    }
	//For Triggers: A trigger is just a collider set only to report overlaps rather than apply a force.
	// When a Box Collider is detected: If this has problems, use the above one with a kinematic rigidbody
	void OnTriggerEnter2D(Collider2D coll)
    {
        Debug.Log("OnTriggerEnter2D: "+coll.gameObject.name);
    }
	void OnTriggerStay2D(Collider2D coll)
    {
        Debug.Log("OnTriggerStay2D: "+coll.gameObject.name);
    }
	void OnTriggerExit2D(Collider2D coll)
    {
        Debug.Log("OnTriggerExit2D: "+coll.gameObject.name);
    }
}
