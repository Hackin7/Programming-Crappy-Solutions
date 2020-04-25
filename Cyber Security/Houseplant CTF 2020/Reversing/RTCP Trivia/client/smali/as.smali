.class public final Las;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Lfs;)Landroid/view/Menu;
    .locals 1

    new-instance v0, Lat;

    invoke-direct {v0, p0, p1}, Lat;-><init>(Landroid/content/Context;Lfs;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lft;)Landroid/view/MenuItem;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    new-instance v0, Lan;

    invoke-direct {v0, p0, p1}, Lan;-><init>(Landroid/content/Context;Lft;)V

    return-object v0

    :cond_0
    new-instance v0, Lam;

    invoke-direct {v0, p0, p1}, Lam;-><init>(Landroid/content/Context;Lft;)V

    return-object v0
.end method
