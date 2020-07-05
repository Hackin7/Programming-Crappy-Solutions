.class final Lia$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lic;

.field final synthetic b:Lde;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lia$a;

.field final synthetic e:Ljava/util/ArrayList;

.field final synthetic f:Landroid/view/View;

.field final synthetic g:Lhp;

.field final synthetic h:Lhp;

.field final synthetic i:Z

.field final synthetic j:Ljava/util/ArrayList;

.field final synthetic k:Ljava/lang/Object;

.field final synthetic l:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lic;Lde;Ljava/lang/Object;Lia$a;Ljava/util/ArrayList;Landroid/view/View;Lhp;Lhp;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lia$4;->a:Lic;

    iput-object p2, p0, Lia$4;->b:Lde;

    iput-object p3, p0, Lia$4;->c:Ljava/lang/Object;

    iput-object p4, p0, Lia$4;->d:Lia$a;

    iput-object p5, p0, Lia$4;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Lia$4;->f:Landroid/view/View;

    iput-object p7, p0, Lia$4;->g:Lhp;

    iput-object p8, p0, Lia$4;->h:Lhp;

    iput-boolean p9, p0, Lia$4;->i:Z

    iput-object p10, p0, Lia$4;->j:Ljava/util/ArrayList;

    iput-object p11, p0, Lia$4;->k:Ljava/lang/Object;

    iput-object p12, p0, Lia$4;->l:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lia$4;->a:Lic;

    iget-object v1, p0, Lia$4;->b:Lde;

    iget-object v2, p0, Lia$4;->c:Ljava/lang/Object;

    iget-object v3, p0, Lia$4;->d:Lia$a;

    invoke-static {v0, v1, v2, v3}, Lia;->a(Lic;Lde;Ljava/lang/Object;Lia$a;)Lde;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lia$4;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lde;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lia$4;->e:Ljava/util/ArrayList;

    iget-object v2, p0, Lia$4;->f:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lia$4;->g:Lhp;

    iget-object v2, p0, Lia$4;->h:Lhp;

    iget-boolean v3, p0, Lia$4;->i:Z

    invoke-static {v1, v2, v3, v0}, Lia;->a(Lhp;Lhp;ZLde;)V

    iget-object v1, p0, Lia$4;->c:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lia$4;->a:Lic;

    iget-object v2, p0, Lia$4;->c:Ljava/lang/Object;

    iget-object v3, p0, Lia$4;->j:Ljava/util/ArrayList;

    iget-object v4, p0, Lia$4;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v4}, Lic;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    iget-object v1, p0, Lia$4;->d:Lia$a;

    iget-object v2, p0, Lia$4;->k:Ljava/lang/Object;

    iget-boolean v3, p0, Lia$4;->i:Z

    invoke-static {v0, v1, v2, v3}, Lia;->a(Lde;Lia$a;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lia$4;->l:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lic;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method
